//code to create a normalizing function (for "n" in this example, "n" can be changed to anything such as "collection" or "t")
{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, "-").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/, { it.lower()}).replaceTrailingBrackets()}; norm(n).replaceFirst(/^(?i)(The|A|An)\s(.+)/, /$2, $1/)}

//move "The|A|An" to end of name, etc
{n.replaceFirst(/^(?i)(The|A|An)\s(.+)/, /$2, $1/)}

//Code to add [END] at last episode in season
{episode == episodelist.findAll{ it.season == s && !it.special}.last() ? '[END]' : null}

//Place Movies in Collection folders, or root Movies directory (no individual movie folders)
{any{collection/ny}{ny}}

//movies into "/collection/[year] name/name" or "/name [year]/name" folders
{any{"$collection/[$y] $n"}{"$n [$y]"}}

//certification from either imdb or omdb, or NR if none
{any{"[$certification]"}{"[$omdb.certification]" }
{any{any{"[$certification]"}{"["+$omdb.certification+"]"}.replaceAll('N A|NOT RATED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'[NR]'}}
//streamlined only using two []
{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}

//movie parts examples, not all working
{"[Disk $pi of $pn]"}
{' ('+episode.toString().match(/\([0-9]+\)$/)[1]+')'}
{t.replacePart(' [$1]')}
{norm(t.replacePart(' (Part $1)'))}

//genre code snippet
{[any{(csv('C:/FileBot/Formats/Movies/MovieGenreFolder.csv').get(n))}{genre.replaceAll('Science Fiction|SciFi & Fantasy','SciFi')}{'No Genre'}]}

//year formats
{if (y) {' ['+y +']'}}
{if (y) {"[$y]"}}
