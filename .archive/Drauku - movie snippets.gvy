
// This snippet moves "The" to the end of names. No longer used due to movie name search inconsistencies.
{any{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, "-").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/,{it.lower()}).replaceTrailingBrackets()};norm(collection).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+"/[$y] "+{any{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n)}{norm(n)}}+' '}{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+" [$y]"}}{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}{"/"}{csv('C:/FileBot/Formats/Movies/MovieFileNames.csv').get(n) ?: norm(n)}{" "}{[y]}{[fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/[._]/, " ")]}{"[Part $pi of $pn]"}{" - "}{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}{"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{"$subt"}{".$ext"}


//older version with separate video and audio info, as well as genre entry
{any{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, "-").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/,{it.lower()}).replaceTrailingBrackets()};norm(collection).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+"/[$y] "+{any{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n)}{norm(n)}}+' '}{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+" [$y]"}}{[any{(csv('C:/FileBot/Formats/Movies/MovieGenreFolder.csv').get(n))}{genre.replaceAll('Science Fiction|SciFi & Fantasy','SciFi')}{'No Genre'}]}{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}{"/"}{csv('C:/FileBot/Formats/Movies/MovieFileNames.csv').get(n) ?: norm(n)}{" "}{[y]}{[fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/[._]/, " ")]}{"[CD$pi of $pn]"}{" - "}{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}{"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{"$subt"}{".$ext"}



{any{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, "-").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/,{it.lower()}).replaceTrailingBrackets()};norm(collection).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+"/[$y] "+{any{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n)}{norm(n)}}+' '}
{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+" [$y]"}}
{[any{(csv('C:/FileBot/Formats/Movies/MovieGenreFolder.csv').get(n))}{genre.replaceAll('Science Fiction|SciFi & Fantasy','SciFi')}{'No Genre'}]}
{"[$rating"+"★]"}
{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}
{"/"}
{csv('C:/FileBot/Formats/Movies/MovieFileNames.csv').get(n) ?: norm(n)}
{" "}
{[y]}
{[fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/[._]/, " ")]}
{"[CD$pi of $pn]"}
{" - "}
{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}
{"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{".$cf"}


//normalized format with no carriage returns (carriage returned lines add spaces between fields when in FileBot)
{any{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, "-").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/,{it.lower()}).replaceTrailingBrackets()};norm(collection).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+"/[$y] "+{any{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n)}{norm(n)}}+' '}{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+" [$y]"}}{[any{(csv('C:/FileBot/Formats/Movies/MovieGenreFolder.csv').get(n))}{genre.replaceAll('Science Fiction|SciFi & Fantasy','SciFi')}{'No Genre'}]}{"[$rating"+"★]"}{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}{"/"}{csv('C:/FileBot/Formats/Movies/MovieFileNames.csv').get(n) ?: norm(n)}{" "}{[y]}{[fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/[._]/, " ")]}{"[CD$pi of $pn]"}{" - "}{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}{"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{".$cf"}

//experimental section

{any
  {if(file.path.lower().matchAll(/anime?/))
    {'M:/Videos/Anime/Movies/'}}
  {if(file.path.lower().matchAll(/kids?/))
    {'M:/Videos/Kids/Movies/'}}
{'M:/Videos/Movies/'}}

{[any{certification}{omdb.certification}{"NR"}.replaceAll('N A','NR').replaceAll(/^ \d+$/, 'PG-$0')]}
{any{any{"[$certification]"}{"["+$omdb.certification+"]"}.replaceAll('N A','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'[NR]'}}


{any{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, "-").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/,{it.lower()}).replaceTrailingBrackets()};norm(collection).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+"/[$y] "+norm(n)+' '}{norm(n).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+" [$y]"}}
{'['+any{(csv('C:/FileBot/Formats/Movies/MovieGenreSetting.csv').get(n))}{genre.replaceAll('Science Fiction|SciFi & Fantasy','SciFi')}{'No Genre'}+']'}
{"[$rating"+"★]"}
{[any{certification}{omdb.certification}{"NR"}.replaceAll('N A','NR').replaceAll(/^ \d+$/, 'PG-$0')]}
{"/"}
{norm(n)}
{[y]}
{' [' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/[._]/, " ") + ']'}
{"[CD$pi of $pn]"}
{" - "}
{[any{any{certification}{omdb.certification}.replaceAll('N A','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}
{"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{".$cf"}

//working format backed up from FileBot on 2016.12.05
{any{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, "-").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/,{it.lower()}).replaceTrailingBrackets()};norm(collection).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+"/[$y] "+{any{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n)}{norm(n)}}+" "}{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+" [$y]"}}{[any{(csv('C:/FileBot/Formats/Movies/MovieGenreFolder.csv').get(n))}{genre.replaceAll('Science Fiction|SciFi & Fantasy','SciFi')}{'No Genre'}]}{"[$rating"+"★]"}{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED|UNRATED|APPROVED|PASSED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}{"/"}{csv('C:/FileBot/Formats/Movies/MovieFileNames.csv').get(n) ?: norm(n)}{" [$y]"}{[fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/[._]/, " ")]}{"[CD$pi of $pn]"}{" - "}{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED|UNRATED|APPROVED|PASSED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}{"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{".$cf"}
//preset "drauku movies"
M:\Videos\Movies\{any{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, "-").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/,{it.lower()}).replaceTrailingBrackets()};norm(collection).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+"/[$y] "+{any{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n)}{norm(n)}}+" "}{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+" [$y]"}}{[any{(csv('C:/FileBot/Formats/Movies/MovieGenreFolder.csv').get(n))}{genre.replaceAll('Science Fiction|SciFi & Fantasy','SciFi')}{'No Genre'}]}{"[$rating"+"★]"}{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED|UNRATED|APPROVED|PASSED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}{"/"}{csv('C:/FileBot/Formats/Movies/MovieFileNames.csv').get(n) ?: norm(n)}{" [$y]"}{[fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/[._]/, " ")]}{"[CD$pi of $pn]"}{" - "}{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED|UNRATED|APPROVED|PASSED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}{"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{".$cf"}
//preset 'kids movies'
M:\Videos\Kids\Movies\{any{norm = {it.replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, "-").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper()}).replaceAll(/\b[0-9](?i:th|nd|rd)\b/,{it.lower()}).replaceTrailingBrackets()};norm(collection).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+"/[$y] "+{any{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n)}{norm(n)}}+" "}{csv('C:/FileBot/Formats/Movies/MovieFolderNames.csv').get(n) ?: norm(n).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+" [$y]"}}{[any{(csv('C:/FileBot/Formats/Movies/MovieGenreFolder.csv').get(n))}{genre.replaceAll('Science Fiction|SciFi & Fantasy','SciFi')}{'No Genre'}]}{"[$rating"+"★]"}{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED|UNRATED|APPROVED|PASSED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}{"/"}{csv('C:/FileBot/Formats/Movies/MovieFileNames.csv').get(n) ?: norm(n)}{" [$y]"}{[fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition/)*.upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/[._]/, " ")]}{"[CD$pi of $pn]"}{" - "}{[any{any{certification}{omdb.certification}.replaceAll('N A|NOT RATED|UNRATED|APPROVED|PASSED','NR').replaceAll(/^ \d+$/, 'PG-$0')}{'NR'}]}{"[$minutes-min]"}{"[$vf-$vc]"}{"[$af-$ac]"}{".$cf"}
