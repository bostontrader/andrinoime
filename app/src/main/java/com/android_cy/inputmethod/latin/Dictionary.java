/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android_cy.inputmethod.latin;

//import com.android.inputmethod.annotations.UsedForTesting;
//import com.android.inputmethod.keyboard.ProximityInfo;
//import com.android.inputmethod.latin.SuggestedWords.SuggestedWordInfo;
//import com.android.inputmethod.latin.settings.SettingsValuesForSuggestion;

//import java.util.ArrayList;

/**
 * Abstract base class for a dictionary that can do a fuzzy search for words based on a set of key
 * strokes.
 */
public abstract class Dictionary {
    //public static final int NOT_A_PROBABILITY = -1;
    //public static final float NOT_A_LANGUAGE_WEIGHT = -1.0f;

    // The following types do not actually come from real dictionary instances, so we create
    // corresponding instances.
    //public static final String TYPE_USER_TYPED = "user_typed";
    //public static final Dictionary DICTIONARY_USER_TYPED = new PhonyDictionary(TYPE_USER_TYPED);

    //public static final String TYPE_APPLICATION_DEFINED = "application_defined";
    //public static final Dictionary DICTIONARY_APPLICATION_DEFINED =
        //new PhonyDictionary(TYPE_APPLICATION_DEFINED);

    //public static final String TYPE_HARDCODED = "hardcoded"; // punctuation signs and such
    //public static final Dictionary DICTIONARY_HARDCODED =
        //new PhonyDictionary(TYPE_HARDCODED);

    // Spawned by resuming suggestions. Comes from a span that was in the TextView.
    //public static final String TYPE_RESUMED = "resumed";
    //public static final Dictionary DICTIONARY_RESUMED =
        //new PhonyDictionary(TYPE_RESUMED);

    // The following types of dictionary have actual functional instances. We don't need final
    // phony dictionary instances for them.
    public static final String TYPE_MAIN = "main";
    //public static final String TYPE_CONTACTS = "contacts";
    // User dictionary, the system-managed one.
    //public static final String TYPE_USER = "user";
    // User history dictionary internal to LatinIME.
    //public static final String TYPE_USER_HISTORY = "history";
    // Personalization dictionary.
    public static final String TYPE_PERSONALIZATION = "personalization";
    // Contextual dictionary.
    //public static final String TYPE_CONTEXTUAL = "contextual";
    public final String mDictType;

    public Dictionary(final String dictType) {
        mDictType = dictType;
    }

    /**
     * Searches for suggestions for a given context. For the moment the context is only the
     * previous word.
     * @param composer the key sequence to match with coordinate info, as a WordComposer
     * @param prevWordsInfo the information of previous words.
     * @param proximityInfo the object for key proximity. May be ignored by some implementations.
     * @param settingsValuesForSuggestion the settings values used for the suggestion.
     * @param sessionId the session id.
     * @param inOutLanguageWeight the language weight used for generating suggestions.
     * inOutLanguageWeight is a float array that has only one element. This can be updated when the
     * different language weight is used.
     * @return the list of suggestions (possibly null if none)
     */
    //abstract public ArrayList<SuggestedWordInfo> getSuggestions(final WordComposer composer,
            //final PrevWordsInfo prevWordsInfo, final ProximityInfo proximityInfo,
            //final SettingsValuesForSuggestion settingsValuesForSuggestion,
            //final int sessionId, final float[] inOutLanguageWeight);

    /**
     * Checks if the given word has to be treated as a valid word. Please note that some
     * dictionaries have entries that should be treated as invalid words.
     * @param word the word to search for. The search should be case-insensitive.
     * @return true if the word is valid, false otherwise
     */
    public boolean isValidWord(final String word) {
        return isInDictionary(word);
    }

    /**
     * Checks if the given word is in the dictionary regardless of it being valid or not.
     */
    abstract public boolean isInDictionary(final String word);

    //public int getFrequency(final String word) {
        //return NOT_A_PROBABILITY;
    //}

    //public int getMaxFrequencyOfExactMatches(final String word) {
        //return NOT_A_PROBABILITY;
    //}

    /**
     * Compares the contents of the character array with the typed word and returns true if they
     * are the same.
     * @param word the array of characters that make up the word
     * @param length the number of valid characters in the character array
     * @param typedWord the word to compare with
     * @return true if they are the same, false otherwise.
     */
    /*protected boolean same(final char[] word, final int length, final String typedWord) {
        if (typedWord.length() != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (word[i] != typedWord.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Override to clean up any resources.
     */
    //public void close() {
        // empty base implementation
    //}
    abstract void close();

    /**
     * Subclasses may override to indicate that this Dictionary is not yet properly initialized.
     */
    //public boolean isInitialized() {
        //return true;
    //}

    /**
     * Whether we think this suggestion should trigger an auto-commit. prevWord is the word
     * before the suggestion, so that we can use n-gram frequencies.
     * @param candidate The candidate suggestion, in whole (not only the first part).
     * @return whether we should auto-commit or not.
     */
    //public boolean shouldAutoCommit(final SuggestedWordInfo candidate) {
        // If we don't have support for auto-commit, or if we don't know, we return false to
        // avoid auto-committing stuff. Implementations of the Dictionary class that know to
        // determine whether we should auto-commit will override this.
        //return false;
    //}

    /**
     * Not a true dictionary. A placeholder used to indicate suggestions that don't come from any
     * real dictionary.
     */
    /*private static class PhonyDictionary extends Dictionary {
        // This class is not publicly instantiable.
        private PhonyDictionary(final String type) {
            super(type);
        }

        @Override
        public ArrayList<SuggestedWordInfo> getSuggestions(final WordComposer composer,
                final PrevWordsInfo prevWordsInfo, final ProximityInfo proximityInfo,
                final SettingsValuesForSuggestion settingsValuesForSuggestion,
                final int sessionId, final float[] inOutLanguageWeight) {
            return null;
        }

        @Override
        public boolean isInDictionary(String word) {
            return false;
        }
    }*/
}
