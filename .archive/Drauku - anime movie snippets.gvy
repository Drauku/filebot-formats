// This snippet moves "The" to the end of names. No longer used due to movie name search inconsistencies.
{any{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, "-").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/,{it.lower()}).replaceTrailingBrackets()};norm(collection).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+"/[$y] "+{any{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n)}{norm(n)}}+' '}{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+" [$y]"}}{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}{"/"}{csv('C:/FileBot/Formats/Movies/MovieFileNames.csv').get(n) ?: norm(n)}{" "}{[y]}{[fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/[._]/, " ")]}{"[Part $pi of $pn]"}{" -0 "}{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}{"[$minutes-min]"}{"[$vf-$vc-$af-$ac]"}{"$subt"}{".$ext"}

//older version with separated video and audio info
M:/Videos/Anime/Movies/
{any{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, "-").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/,{it.lower()}).replaceTrailingBrackets()};norm(collection).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+"/[$y] "+{any{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n)}{norm(n)}}+' '}{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+" [$y]"}}{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}{"/"}{csv('C:/FileBot/Formats/Movies/MovieFileNames.csv').get(n) ?: norm(n)}{" "}{[y]}{[fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/[._]/, " ")]}{"[CD$pi of $pn]"}{" - "}{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}{"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{"$subt"}{".$ext"}

========================================


{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, {it.lower()})}; norm(n).replaceFirst(/^(?i)(The|A|An)\s(.+)/, /$2, $1/).replaceTrailingBrackets()}
{if (norm(n) != norm(primaryTitle)) ' ('+norm(primaryTitle)+')'}
{" "}
{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D ':""}
{"[$y]"}
{"[$rating★]"}
{[any{certification}{omdb.certification}{"NR"}.replaceAll('N A','NR').replaceAll(/^ \d+$/, 'PG-$0')]}
{"/"}
{[episodelist.findAll{it.season == s}.airdate.year.min()]}
{episode.special ? ' Season '+s.pad(2)+'/[Specials]' : ' Season '+s.pad(2)}
{"/"}
{csv('C:/FileBot/Formats/Shows/ShowFileNames.csv').get(n) ?: norm(n).replaceTrailingBrackets()}
{' '+[episode.special ? 's00e'+special.pad(2)+'' : ''+s00e00.lower()+'']+' '}
{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}
{norm(t.replaceAll("\\s*[(]([^)]*)[)]\$", {group, match -> ' (Part '+match.pad(2)+')' }))}
{' (' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition|unsold.pilot|unaired.pilot|unaired.episode/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/ [._]/, " ") + ')'}
{' ('+episode.toString().match(/\([0-9]+\)$/)[1]+')'}
{" - "}
{"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{any{".$cf"}{".$ext"}}

//working format backed up from FileBot on 2016.12.05
//preset "Airdate Order"
{norm = {it.upperInitial().lowerTrail().replaceTrailingBrackets().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper() }).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, { it.lower() }).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)}; norm(n)}{if (norm(n) != norm(primaryTitle)) ' ('+norm(primaryTitle)+')'}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""} ({y}{' '+any{certification}{imdb.certification}.replaceAll(/^\d+$/, 'PG-$0')})/{norm(n)} - {absolute.pad(episodelist.size() < 99 ? 2 : 3)}{'Special '+special.pad(episodelist.size() < 99 ? 2 : 3)} - {norm(t)}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}{' (' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/[._]/, " ") + ')'}{" Part $pi"}{" [$vf $vc $ac $af]"}
//preset "DVD Order"
{norm = {it.upperInitial().lowerTrail().replaceTrailingBrackets().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper() }).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, { it.lower() }).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)}; norm(n)}{if (norm(n) != norm(primaryTitle)) ' ('+norm(primaryTitle)+')'}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""} ({y}{' '+any{certification}{imdb.certification}.replaceAll(/^\d+$/, 'PG-$0')})/{norm(n)} - {absolute.pad(episodelist.size() < 99 ? 2 : 3)}{'Special '+special.pad(episodelist.size() < 99 ? 2 : 3)} - {norm(t)}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}{' (' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/[._]/, " ") + ')'}{t.replacePart(' [$1]')}{" [$vf $vc $ac $af]"}
//preset "Absolute Order"
{norm = {it.upperInitial().lowerTrail().replaceTrailingBrackets().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper() }).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, { it.lower() }).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)}; norm(n)}{if (norm(n) != norm(primaryTitle)) ' ('+norm(primaryTitle)+')'}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""} ({y}{' '+any{certification}{imdb.certification}.replaceAll(/^\d+$/, 'PG-$0')})/{norm(n)} - {absolute.pad(episodelist.size() < 99 ? 2 : 3)}{'Special '+special.pad(episodelist.size() < 99 ? 2 : 3)} - {norm(t)}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}{' (' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/[._]/, " ") + ')'}{" Part $pi"}{" [$vf $vc $ac $af]"}
