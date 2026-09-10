package com.badlogic.gdx.backends.android.keyboardheight;

/* JADX INFO: loaded from: classes.dex */
public interface KeyboardHeightProvider {
    void close();

    int getKeyboardLandscapeHeight();

    int getKeyboardPortraitHeight();

    void setKeyboardHeightObserver(KeyboardHeightObserver keyboardHeightObserver);

    void start();
}
