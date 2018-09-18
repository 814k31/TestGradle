Build: `gradle build`
Run: `gradle run`

Dependency Chain

```
app imports OneDeep
OneDeep imports TwoDeep
```

Directory structure

```
app
oneDeep
    twoDeep
       build.gradle
    build.gradle
build.gradle
settings.gradle
```