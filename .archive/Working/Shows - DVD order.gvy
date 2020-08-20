{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, {it.lower()})}; norm(n).replaceFirst(/^(?i)(The|A|An)\s(.+)/, /$2, $1/).replaceTrailingBrackets()}
{if (norm(n) != norm(primaryTitle)) ' ('+norm(primaryTitle)+')'}
{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}
{if (y) {' ['+y +']'}}
{'['+csv('C:/FileBot/Formats/Shows/ShowGenreSetting.csv').get(n)+']' ?: '['+genre+']'}
{"[$rating" + "★]"}
{any{"[$certification]"}{"["+$omdb.certification+"]" }.replaceAll('N A','NR').replaceAll(/^ \d+$/, 'PG-$0')}
{"/"}
{[episodelist.findAll{it.season == s}.airdate.year.min()]}
{episode.special ? ' Season '+s.pad(2)+'/[Specials]' : ' Season '+s.pad(2)}
{"/"}
{csv('C:/FileBot/Formats/Shows/TVFileShowNames.csv').get(n) ?: norm(n).replaceTrailingBrackets()}
{' '+[episode.special ? 's00e'+special.pad(2)+'' : ''+s00e00.lower()+'']+' '}
{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}
{' (' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition|unsold.pilot|unaired.pilot|unaired.episode/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/ [._]/, " ") + ')'}
{norm(t.replaceAll("\\s*[(]([^)]*)[)]\$", {group, match -> ' (Part '+match.pad(2)+')' }))}
{' ('+episode.toString().match(/\([0-9]+\)$/)[1]+')'}
{" - "}
{"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{any{".$cf"}{".$ext"}}
