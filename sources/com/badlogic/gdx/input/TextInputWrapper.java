package com.badlogic.gdx.input;

/* JADX INFO: loaded from: classes.dex */
public interface TextInputWrapper {
    int getSelectionEnd();

    int getSelectionStart();

    String getText();

    void setPosition(int i);

    void setText(String str);

    boolean shouldClose();
}
