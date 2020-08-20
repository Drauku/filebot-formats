{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, {it.lower()}).replaceTrailingBrackets()}; csv('C:/FileBot/Formats/Shows/ShowFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The|A|An)\s(.+)/, /$2, $1/)}{' '+n.match(/\([A-Z]+\)$/)}{if ((n) != (primaryTitle)) ' ('+norm(primaryTitle)+')'}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}{if (y) {' ['+y +']'}}{"[$rating"+"★]"}{any{"[$certification]"}{"["+$omdb.certification+"]" }.replaceAll('N A','NR').replaceAll(/^ \d+$/, 'PG-$0')}{"/"}{[episodelist.findAll{it.season == s}.airdate.year.min()]}{episode.special ? ' Season '+s.pad(2)+'/[Specials]' : ' Season '+s.pad(2)}
{"/"}
{csv('C:/FileBot/Formats/Shows/ShowFileNames.csv').get(n) ?: norm(n)}
{' '+n.match(/\([A-Z]+\)$/)}
{' '+n.match(/\([0-9]+\)$/)}
{" "}
{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D ':""}
{[episode.special ? 's00e'+special.pad(2)+'' : ''+s00e00.lower()+'']}
{" "}
{norm(t.replaceAll("\\s*[(]([^)]*)[)]\$", ))}
{" "}
{'('+episode.toString().match(/\([0-9]+\)$/)[1]+')'}
{" - "}
{' [' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition|unsold.pilot|unaired.pilot|unaired.episode/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/ [._]/, " ") + ']'}
{"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{any{".$cf"}{".$cf"}}














{n.replaceTrailingBrackets()} - {s+'x'}{e.pad(2)} - {t.replaceAll(/[!?.]+$/).replaceAll(/[`´‘’ʻ]/, "'")
.lowerTrail().replacePart(', Part $1')}
