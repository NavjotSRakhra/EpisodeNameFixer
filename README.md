# Episode Name Fixer

## Description

The EpisodeNameFixer is a simple tool designed to help you rename episode files in a specific directory to a
standardized format: SXXEYY. This format includes the season number (SXX) and episode number (EYY), making it easier to
organize and identify your episodes.

## Usage

EpisodeNameFixer <directory> <season_number>

- <directory>: This is the path to the folder where your episode files are located. You can use either a full path (like
  C:\TV Shows\MyShow\) or a relative path (like ./MyShow/). Ensure that this directory contains the episode files you
  want
  to rename.
- <season_number>: This is the season number of the episodes in the specified directory. For example, if you want to
  rename the episodes for Season 2, you would enter 2. Please enter just the number, without any extra characters.

## Episode Naming Format (SXXEYY)

- SXX: This represents the season number.
  For example, if you specify 2, the format will include S02.
- EYY: This represents the episode number within that season.
  For example, if the first episode is being renamed, it will appear as E01, the second as E02, and so on.

## Example

If your episode files are located in `C:\TV Shows\MyShow\Season 2` and you want to fix the names for **_Season 2_**, you
would
run:

`EpisodeNameFixer "C:\TV Shows\MyShow\Season 2" 2`

This command will rename your files to look like:

`Episode Title S02E01.mvk`

`Episode Title S02E02.mvk`

`Episode Title S02E03.mvk`

And so forth, in order, according to the episode's sequence.

## Important Notes

Ensure that your episode files are named in a consistent manner (like using titles or numbers) so the tool can identify
and rename them correctly.
It’s advisable to back up your files before running this tool, just in case something doesn’t go as planned.
The tool will automatically rename your files in the SXXEYY format, where XX is the season number you provided, and YY
is the episode number assigned in order.
---

## Requirements to run

- Windows 10/11 (Executable Tested on Windows 11)
- Linux executable provided in releases or you can build your own using GraalVM for more information on building it refer to the next subheading. (Executable tested on Ubuntu 25 LTS)
- Linux / macOS (Jar file can run on any OS with a JRE 21)

## Requirements to build

- GraalVM JDK 21 CE (I highly recommend install it through [scoop.sh](https://scoop.sh/))
- Maven

## Steps to build Jar

```shell
git clone https://github.com/NavjotSRakhra/EpisodeNameFixer.git
cd EpisodeNameFixer
mvn package
```

## Steps to build executable

```shell
git clone https://github.com/NavjotSRakhra/EpisodeNameFixer.git
cd EpisodeNameFixer
mvn native:compile -Pnative
```

## Build output
You will see the output in `/target` folder inside the repository
