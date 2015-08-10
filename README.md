#Executive Summary
The purpose of the **AndrinoIME** is to implement an input method editor (IME) for Android
devices that is customized for use in typing Javascript source code.

##What makes a Javascript IME?

If you've ever tried to deal with Javascript source code using other IMEs, you've no
doubt encountered the frustration of finding the various symbols needed.  They are typically
scattered across several keyboard views and it's very tedious to switch back and forth between
keyboards in order to do anything.  We felt your pain so the **AndrinoIME** helps alleviate
this noxious issue by employing the following methods:

###Rethink the collection of symbols
The main keyboard of the **AndrinoIME** has:

* 10 numeric digits
* 17 essential symbols
* 13 of the most commonly used lower-case English letters.

Given this character set, it is easy to quickly enter the digits and symbols that are
needed by Javascript.

###Predict keywords and identifiers
The **AndrinoIME** attempts to predict keywords and identifiers.

###Other keyboards are still lurking nearby
The **AndrinoIME** does offer an escape hatch to additional, more conventional, keyboards.
 If the limited character set mentioned infra is missing one of your favorite characters, the
 other keyboards can be used to find it.  Hopefully this use is reserved for the most infrequently
 used characters, lest the entire purpose of the **AndrinoIME** be defeated.
