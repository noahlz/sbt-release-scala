# SBT Release Plugin - Minimal Example

This project demonstrates using the [sbt-release](https://github.com/sbt/sbt-release) plugin. Most examples are geared towards the more modern `build.sbt` configuration; this example uses the `build.scala` configuration format.

In addition, it has custom:

- release commit message
- tag message
- build process (it does not clean, run tests or publish artifacts)

## Usage

From the command line

```
$ sbt release
```

or in the sbt console

```
$ sbt

> release
```

### Example Session

```
$ sbt release

...

[info] Set current project to App (in build file:/home/nzucker/projects/sbt-release-scala/)
[info] Starting release process off commit: 9eb1b97551722927e30238dca32cb4fbee336e1d
[info] Checking remote [origin] ...
Release version [1.0.0] :
Next version [1.0.1-SNAPSHOT] :
[info] Setting version to '1.0.0'.
[info] Reapplying settings...
[info] Set current project to App (in build file:/home/nzucker/projects/sbt-release-scala/)
[info] [master 8f7c919a21] App version 1.0.0
[info]  1 file changed, 1 insertion(+), 1 deletion(-)
[info] Reapplying settings...
[info] Set current project to App (in build file:/home/nzucker/projects/sbt-release-scala/)
[info] Reapplying settings...
[info] Set current project to App (in build file:/home/nzucker/projects/sbt-release-scala/)
[info] Setting version to '1.0.1-SNAPSHOT'.
[info] Reapplying settings...
[info] Set current project to App (in build file:/home/nzucker/projects/sbt-release-scala/)
[info] [master 97e2703135] Post-release. Next version is 1.0.1-SNAPSHOT
[info]  1 file changed, 1 insertion(+), 1 deletion(-)
Push changes to the remote repository (y/n)? [y] y
[info] To ssh://git@gitrepo/~nzucker/sbt-release-scala.git
[info]    9eb1b97551..97e2703135  master -> master
[info] To ssh://gitgitrepo/~nzucker/sbt-release-scala.git
[info]  * [new tag]               v1.0.0 -> v1.0.0

$ git log --oneline
97e2703135 (HEAD -> master, origin/master) Post-release. Next version is 1.0.1-SNAPSHOT
8f7c919a21 (tag: v1.0.0) App version 1.0.0
9eb1b97551 Initial commit.
```

## Acknowledgements

### Guidance and Source Code

While creating this project, I referred to [Painless release with SBT](http://blog.byjean.eu/2015/07/10/painless-release-with-sbt.html) by [@jeantil](https://github.com/jeantil).

Original source: [painless-sbt-build](https://github.com/jeantil/blog-samples/tree/painless-sbt-build)

Thank you, Jean, for your helpful blog post.


### Project Template

The template for this project was the [giter8](https://github.com/foundweekends/giter8) template [basic-scala-project](https://github.com/fayimora/basic-scala-project.g8)


## License

Published under the [Creative Commons Zero v1.0 Univeral License](https://creativecommons.org/publicdomain/zero/1.0/) except where noted.
