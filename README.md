# Compose Awesome Dialog 
![Jitpack](https://jitpack.io/v/farhanroy/compose-awesome-dialog.svg) ![GitHub issues](https://img.shields.io/github/issues/farhanroy/compose-awesome-dialog)  [![GitHub forks](https://img.shields.io/github/forks/farhanroy/compose-awesome-dialog)](https://github.com/hbb20/CountryCodePickerProject/network) [![GitHub stars](https://img.shields.io/github/stars/farhanroy/compose-awesome-dialog)](https://github.com/hbb20/CountryCodePickerProject/stargazers) [![GitHub license](https://img.shields.io/github/license/farhanroy/compose-awesome-dialog)](https://github.com/farhanroy/compose-awesome-dialog/blob/master/License.txt) 
 
Library untuk Android Native yang menggunakan Jetpack Compose untuk toolkit UI nya. Compose Awesome Dialog ini menampilkan Dialog material yang dilengkapi animasi agar lebih ciamik

Anda tidak perlu lagi membuat lagi komponen dialog dari awal tinggal install library ini.

**Lihat contoh run app nya** biar bisa lebih jelas

## How to add in your project
In the `build.gradle` add maven central repository
```
repositories {
    maven { url 'https://jitpack.io' }
}
```
Then, add library at `app/build.gradle` with following code
```groove
    dependencies {
	        implementation 'com.github.farhanroy:compose-awesome-dialog:Tag'
    }
```

## How to use ?

```kotlin
        val openDialog = remember { mutableStateOf(false)  }

        Button(onClick = { openDialog.value = true }) {
            Text(text = "Open")
        }

        if (openDialog.value) {
            ComposeAwesomeDialog(
                type = ComposeAwesomeDialogType.Success,
                title = "Success",
                desc = "This is success dialog",
                onDismiss = { openDialog.value = false }
            )
        }

```

## Preview
 
This is preview sample app when using awesome dialog with jetpack compose
 
<img src="https://raw.githubusercontent.com/farhanroy/compose-awesome-dialog/main/screenshots/demo.gif" width="270" height="550">

## License
```
 Apache License
                           Version 2.0, January 2004
                        http://www.apache.org/licenses/

   TERMS AND CONDITIONS FOR USE, REPRODUCTION, AND DISTRIBUTION

   1. Definitions.

      "License" shall mean the terms and conditions for use, reproduction,
      and distribution as defined by Sections 1 through 9 of this document.

      "Licensor" shall mean the copyright owner or entity authorized by
      the copyright owner that is granting the License.

      "Legal Entity" shall mean the union of the acting entity and all
      other entities that control, are controlled by, or are under common
      control with that entity. For the purposes of this definition,
      "control" means (i) the power, direct or indirect, to cause the
      direction or management of such entity, whether by contract or
      otherwise, or (ii) ownership of fifty percent (50%) or more of the
      outstanding shares, or (iii) beneficial ownership of such entity.
```