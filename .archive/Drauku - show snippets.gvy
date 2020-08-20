
// This snippet moves "The" to the end of names. No longer used due to movie name search inconsistencies.
{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, {it.lower()})}; csv('C:/FileBot/Formats/Shows/ShowFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The|A|An)\s(.+)/, /$2, $1/)}{' '+n.match(/\([A-Z]+\)$/)}{if ((n) != (primaryTitle)) ' ('+norm(primaryTitle)+')'}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}{if (y) {' ['+y +']'}}{any{"[$certification]"}{"[$omdb.certification]" }.replaceAll('N A','NR').replaceAll(/^ \d+$/, 'PG-$0')}{"/"}{[episodelist.findAll{it.season == s}.airdate.year.min()]}{episode.special ? ' Season '+s.pad(2)+'/[Specials]' : ' Season '+s.pad(2)}{"/"}{csv('C:/FileBot/Formats/Shows/ShowFileNames.csv').get(n) ?: norm(n.replaceTrailingBrackets())}{' '+n.match(/\([A-Z]+\)$/)}{' '+n.match(/\([0-9]+\)$/)}{" "}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D ':""}{[episode.special ? 's00e'+special.pad(2)+'' : ''+s00e00.lower()+'']}{" "}{norm(t.replacePart(' (Part $1)'))}{" - "}{' [' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition|unsold.pilot|unaired.pilot|unaired.episode/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/ [._]/, " ") + ']'}{"[$minutes-min]"}{"[$vf-$vc-$af-$ac]"}{".$ext"}


//human-readable format, same as below (WORKING 2017-01-10)
M:\Videos\Shows\
M:\Videos\Kids\Shows\
M:\Videos\Anime\Shows\
{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, {it.lower()})}; csv('C:/FileBot/Formats/Shows/ShowFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The|A|An)\s(.+)/, /$2, $1/)}
{' '+n.match(/\([A-Z]+\)$/)}
{if ((n) != (primaryTitle)) ' ('+norm(primaryTitle)+')'}
{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}
{if (y) {' ['+y +']'}}
{"[$rating"+"★]"}
{any{"[$certification]"}{"["+$omdb.certification+"]" }.replaceAll('N A','NR').replaceAll(/^ \d+$/, 'PG-$0')}
{"/"}
{[episodelist.findAll{it.season == s}.airdate.year.min()]}
{episode.special ? ' Season '+s.pad(2)+'/[Specials]' : ' Season '+s.pad(2)}
{"/"}
{csv('C:/FileBot/Formats/Shows/ShowFileNames.csv').get(n) ?: norm(n.replaceTrailingBrackets())}
{' '+n.match(/\([A-Z]+\)$/)}
{' '+n.match(/\([0-9]+\)$/)}
{" "}
{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D ':""}
{[episode.special ? 's00e'+special.pad(2)+'' : ''+s00e00.lower()+'']}
{" "}
{norm(t.replacePart(' (Part $1)'))}
{" - "}
{' [' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition|unsold.pilot|unaired.pilot|unaired.episode/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/ [._]/, " ") + ']'}
{"[$minutes-min]"}
{"[$vf-$vc]"}
{"[$af-$ac]"}
{any{".$cf"}{".$ext"}}

//normalized format with no carriage returns
{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, {it.lower()})}; csv('C:/FileBot/Formats/Shows/ShowFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The|A|An)\s(.+)/, /$2, $1/)}{' '+n.match(/\([A-Z]+\)$/)}{if ((n) != (primaryTitle)) ' ('+norm(primaryTitle)+')'}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}{if (y) {' ['+y +']'}}{"[$rating"+"★]"}{any{"[$certification]"}{"["+$omdb.certification+"]" }.replaceAll('N A','NR').replaceAll(/^ \d+$/, 'PG-$0')}{"/"}{[episodelist.findAll{it.season == s}.airdate.year.min()]}{episode.special ? ' Season '+s.pad(2)+'/[Specials]' : ' Season '+s.pad(2)}{"/"}{csv('C:/FileBot/Formats/Shows/ShowFileNames.csv').get(n) ?: norm(n.replaceTrailingBrackets())}{' '+n.match(/\([A-Z]+\)$/)}{' '+n.match(/\([0-9]+\)$/)}{" "}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D ':""}{[episode.special ? 's00e'+special.pad(2)+'' : ''+s00e00.lower()+'']}{" "}{norm(t.replacePart(' (Part $1)'))}{" - "}{' [' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition|unsold.pilot|unaired.pilot|unaired.episode/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/ [._]/, " ") + ']'}{"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{any{".$cf"}{".$ext"}}

//experimental section

// UNUSED SNIPPETS
{"[$rating" + "★]"}
{' '+n.match(/\([A-Z]+\)$/)}
{' '+n.match(/\([0-9]+\)$/)}
{[airdate.format("yyyy-MM-dd")]}
{[csv('C:/FileBot/Formats/Shows/TVNetwork.csv').get(info.network) ?: info.network]}
{episode.special ? ' Season '+s.pad(2)+'/[Specials]' : ' Season '+s.pad(2)}
{any
  {if (file.path.lower().matchAll(/videos/anime?/))'M:/Videos/Anime/Shows/'}
  {if (file.path.lower().matchAll(/videos/kids?/))'M:/Videos/Kids/Shows/'}
  {'M:\Videos\Shows\'}}
'
//test trying to get date before the "specials" folder
G:\Media\Videos\Shows\
{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, {it.lower()})}; norm(n).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/).replaceTrailingBrackets()}
{' '+n.match(/\([A-Z]+\)$/)}{if (norm(n) != norm (primaryTitle)) ' ('+norm(primaryTitle)+')'}
{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}
{if (y) {' ['+y +']'}}
{any{"[$certification]"}{"["+$omdb.certification+"]" }.replaceAll('N A','NR').replaceAll(/^ \d+$/, 'PG-$0')}
/
{[episodelist.findAll{ it.season == s }.airdate.year.min()]}
{episode.special ? '['+episodelist.findAll{it.season == s}.airdate.year.min()+'] [Specials]' : ' Season '+s.pad(2)}
/
{csv('C:/FileBot/Formats/Shows/TVFileShowNames.csv').get(n) ?: norm(n).replaceTrailingBrackets()}
{' '+n.match(/\([A-Z]+\)$/)}{' '+n.match(/\([0-9]+\)$/)}
{[episode.special ? 's00e'+special.pad(2)+'' : ''+s00e00.lower()+'']}
{norm(t.replaceAll("\\s*[(]([^)]*)[)]\$", { group, match -> ' (Part '+match.pad(2)+')' }))}
{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}
{' (' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition|unsold.pilot|unaired.pilot| unaired.episode/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/ [._]/, " ") + ')'}
{' ('+episode.toString().match(/\([0-9]+\)$/)[1]+')'} - {"[$minutes-min]"}{episode.special ? [airdate.format("yyyy-MM-dd")]}{"[$vf-$vc]"}{"[$af-$ac]"}{'.'+cf}

//working show format with rating stars
{norm = {it.upperInitial().lowerTrail().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, {it.lower()})}; norm(n).replaceFirst(/^(?i)(The|A|An)\s(.+)/, /$2, $1/).replaceTrailingBrackets()}{' '+n.match(/\([A-Z]+\)$/)}{if (norm(n) != norm (primaryTitle)) ' ('+norm(primaryTitle)+')'}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}{if (y) {' ['+y +']'}}{' '+any{"[$certification]"}{"["+$imdb.certification+"]" }.replaceAll('N A','NR').replaceAll(/^ \d+$/, 'PG-$0')}{" [$rating" + "★]"} [{csv('C:/FileBot/Formats/Shows/TVNetwork.csv').get(info.network) ?: info.network }]/{[episodelist.findAll{ it.season == s }.airdate.year.min()]} {episode.special ? ' Season '+s.pad(2)+'/[Specials]' : ' Season '+s.pad(2)}/{csv('C:/FileBot/Formats/Shows/TVFileShowNames.csv').get(n) ?: norm(n).replaceTrailingBrackets()}{' '+n.match(/\([A-Z]+\)$/)}{' '+n.match(/\([0-9]+\)$/)} {[episode.special ? 's00e'+special.pad(2)+'' : ''+s00e00.lower()+'']} {norm(t.replaceAll("\\s*[(]([^)]*)[)]\$", { group, match -> ' (Part '+match.pad(2)+')' }))}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}{' (' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition|unsold.pilot|unaired.pilot| unaired.episode/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/ [._]/, " ") + ')'}{' ('+episode.toString().match(/\([0-9]+\)$/)[1]+')'} -{" [$minutes Min]"}{' '+[airdate.format("yyyy-MM-dd")]}{" [$source]"}{" [$vf $ac $af]"}

//working format backed up from FileBot on 2016.12.05
{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, {it.lower()}).replaceTrailingBrackets()}; csv('C:/FileBot/Formats/Shows/ShowFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The|A|An)\s(.+)/, /$2, $1/)}{' '+n.match(/\([A-Z]+\)$/)}{if ((n) != (primaryTitle)) ' ('+norm(primaryTitle)+')'}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}{if (y) {' ['+y +']'}}{"[$rating"+"★]"}{any{"[$certification]"}{"["+$omdb.certification+"]" }.replaceAll('N A','NR').replaceAll(/^ \d+$/, 'PG-$0')}{"/"}{[episodelist.findAll{it.season == s}.airdate.year.min()]}{episode.special ? ' Season '+s.pad(2)+'/[Specials]' : ' Season '+s.pad(2)}{"/"}{csv('C:/FileBot/Formats/Shows/ShowFileNames.csv').get(n) ?: norm(n)}{' '+n.match(/\([A-Z]+\)$/)}{' '+n.match(/\([0-9]+\)$/)}{" "}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D ':""}{[episode.special ? 's00e'+special.pad(2)+'' : ''+s00e00.lower()+'']}{" "}{norm(t.replaceAll("\\s*[(]([^)]*)[)]\$", {group, match -> ' (Part '+match.pad(2)+')' }))}{" "}{'('+episode.toString().match(/\([0-9]+\)$/)[1]+')'}{" - "}{' [' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition|unsold.pilot|unaired.pilot|unaired.episode/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/ [._]/, " ") + ']'}{"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{any{".$cf"}{".$cf"}}
//preset "Airdate Order"
{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, {it.lower()}).replaceTrailingBrackets()}; csv('C:/FileBot/Formats/Shows/ShowFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The|A|An)\s(.+)/, /$2, $1/)}{' '+n.match(/\([A-Z]+\)$/)}{if ((n) != (primaryTitle)) ' ('+norm(primaryTitle)+')'}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}{if (y) {' ['+y +']'}}{any{"[$certification]"}{"["+$omdb.certification+"]" }.replaceAll('N A','NR').replaceAll(/^ \d+$/, 'PG-$0')}{"[$rating"+"★]"}{"/"}{[episodelist.findAll{it.season == s}.airdate.year.min()]}{episode.special ? ' Season '+s.pad(2)+'/[Specials]' : ' Season '+s.pad(2)}{"/"}{csv('C:/FileBot/Formats/Shows/ShowFileNames.csv').get(n) ?: norm(n)}{' '+n.match(/\([A-Z]+\)$/)}{' '+n.match(/\([0-9]+\)$/)}{" "}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D ':""}{[episode.special ? 's00e'+special.pad(2)+'' : ''+s00e00.lower()+'']}{" "}{norm(t.replaceAll("\\s*[(]([^)]*)[)]\$", {group, match -> ' (Part '+match.pad(2)+')' }))}{" "}{'('+episode.toString().match(/\([0-9]+\)$/)[1]+')'}{" - "}{' [' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition|unsold.pilot|unaired.pilot|unaired.episode/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/ [._]/, " ") + ']'}{"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{any{".$cf"}{".$ext"}}
//preset "DVD Order"
{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, {it.lower()}).replaceTrailingBrackets()}; csv('C:/FileBot/Formats/Shows/ShowFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The|A|An)\s(.+)/, /$2, $1/)}{' '+n.match(/\([A-Z]+\)$/)}{if ((n) != (primaryTitle)) ' ('+norm(primaryTitle)+')'}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}{if (y) {' ['+y +']'}}{"[$rating"+"★]"}{any{"[$certification]"}{"["+$omdb.certification+"]" }.replaceAll('N A','NR').replaceAll(/^ \d+$/, 'PG-$0')}{"/"}{[episodelist.findAll{it.season == s}.airdate.year.min()]}{episode.special ? ' Season '+s.pad(2)+'/[Specials]' : ' Season '+s.pad(2)}{"/"}{csv('C:/FileBot/Formats/Shows/ShowFileNames.csv').get(n) ?: norm(n)}{' '+n.match(/\([A-Z]+\)$/)}{' '+n.match(/\([0-9]+\)$/)}{" "}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D ':""}{[episode.special ? 's00e'+special.pad(2)+'' : ''+s00e00.lower()+'']}{" "}{norm(t.replaceAll("\\s*[(]([^)]*)[)]\$", {group, match -> ' (Part '+match.pad(2)+')' }))}{" "}{'('+episode.toString().match(/\([0-9]+\)$/)[1]+')'}{" - "}{' [' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition|unsold.pilot|unaired.pilot|unaired.episode/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/ [._]/, " ") + ']'}{"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{any{".$cf"}{".$cf"}}
//preset "Absolute Order"
{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, {it.lower()})}; norm(n).replaceFirst(/^(?i)(The|A|An)\s(.+)/, /$2, $1/).replaceTrailingBrackets()}{if (norm(n) != norm(primaryTitle)) ' ('+norm(primaryTitle)+')'}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}{if (y) {' ['+y +']'}}{any{"[$certification]"}{"["+$omdb.certification+"]" }.replaceAll('N A','NR').replaceAll(/^ \d+$/, 'PG-$0')}{"[$rating" + "★]"}/{[episodelist.findAll{it.season == s}.airdate.year.min()]}{episode.special ? ' Season '+s.pad(2)+'/[Specials]' : ' Season '+s.pad(2)}/{csv('C:/FileBot/Formats/Shows/TVFileShowNames.csv').get(n) ?: norm(n).replaceTrailingBrackets()}{' '+[episode.special ? 's00e'+special.pad(2)+'' : ''+s00e00.lower()+'']+' '}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}{' (' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition|unsold.pilot|unaired.pilot|unaired.episode/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/ [._]/, " ") + ')'}{norm(t.replaceAll("\\s*[(]([^)]*)[)]\$", {group, match -> ' (Part '+match.pad(2)+')' }))}{' ('+episode.toString().match(/\([0-9]+\)$/)[1]+')'} - {"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{any{".$cf"}{".$ext"}}
