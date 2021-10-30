# Compose Country Code 
![Jitpack](https://jitpack.io/v/farhanroy/ComposeCountryCodePicker.svg) ![GitHub issues](https://img.shields.io/github/issues/farhanroy/ComposeCountryCodePicker)  [![GitHub forks](https://img.shields.io/github/forks/farhanroy/ComposeCountryCodePicker)](https://github.com/hbb20/CountryCodePickerProject/network) [![GitHub stars](https://img.shields.io/github/stars/farhanroy/ComposeCountryCodePicker)](https://github.com/hbb20/CountryCodePickerProject/stargazers) [![GitHub license](https://img.shields.io/github/license/farhanroy/ComposeCountryCodePicker)](https://github.com/hbb20/CountryCodePickerProject/blob/master/License.txt) 
 
Country code picker for Jetpack Compose.

## How to add in your project
In the `build.gradle` add maven central repository
```
repositories {
    maven { url 'https://jitpack.io' }
}
```
Then, add library at `app/build.gradle` with following code
```groove
implementation 'com.github farhanroy:ComposeCountryCodePicker:Tag'
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