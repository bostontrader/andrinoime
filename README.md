#Executive Summary
The purpose of the **AndrinoIME** is to implement an input method editor (IME) for Android
devices that is customized for use in typing Javascript source code.

##What makes a Javascript IME?

If you've ever tried to deal with Javascript source code using other IMEs, you've no
doubt encountered the frustration of finding the various symbols needed.  They are typically
scattered across several keyboard views and it's very tedious to switch back and forth between
them in order to do anything.  We felt your pain so we created the **AndrinoIME** to help
alleviate this noxious issue.  In order to do so we employ the following methods:

###Rethink the keyboard
There are two basic approaches would could take.  Is it possible to squeeze a minimum usable
character set onto a single keyboard?  It is it possible to squeeze a more conventional keyboard
into the small area of a mobile device?  The **AndrinoIME** gives you a choice of either method.

####Minimal character collection
The main keyboard of the **AndrinoIME** has:

* 10 numeric digits
* 17 essential symbols
* 13 of the most commonly used lower-case English letters.

Given this character set, it is easy to quickly enter the digits and symbols that are
needed by Javascript.  There is plenty of Javascript work that we can do, such as
exploration of functionality, that does not require every English letter.

####The Jumbo keyboard
A conventional keyboard as found on laptops and desktops works fairly well.  It provides
a large selection of characters, with an alternate set just a single shift-key away.
We also happen to already know the arrangement of the symbols.  This makes life easier
when looking for them. Although it may be a tight fit in close quarters, the keys stretch-to-fit.
As with the clothing of similar characteristics of other people in your life, this _can_ work.

###Predict keywords and identifiers
Regardless of the keyboard used, it's also handy to do some predicting.
The **AndrinoIME** attempts to predict keywords and identifiers.

###Don't forget Unicode
Although this is not directly a feature of **AndrinoIME**, you can readily type "\u"
Unicode escape sequences for any scraps of Klingon or whatever you need, that just
don't fit on the keyboard.
