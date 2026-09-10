package com.badlogic.gdx.input;

import com.badlogic.gdx.Input;

/* JADX INFO: loaded from: classes.dex */
public class NativeInputConfiguration {
    private Integer maxLength;
    private TextInputWrapper textInputWrapper;
    private Input.InputStringValidator validator;
    private Input.OnscreenKeyboardType type = Input.OnscreenKeyboardType.Default;
    private boolean preventCorrection = false;
    private boolean isMultiLine = false;
    private String placeholder = "";
    private boolean showPasswordButton = false;
    private String[] autoComplete = null;

    public String[] getAutoComplete() {
        return this.autoComplete;
    }

    public Integer getMaxLength() {
        return this.maxLength;
    }

    public String getPlaceholder() {
        return this.placeholder;
    }

    public TextInputWrapper getTextInputWrapper() {
        return this.textInputWrapper;
    }

    public Input.OnscreenKeyboardType getType() {
        return this.type;
    }

    public Input.InputStringValidator getValidator() {
        return this.validator;
    }

    public boolean isMultiLine() {
        return this.isMultiLine;
    }

    public boolean isPreventCorrection() {
        return this.preventCorrection;
    }

    public boolean isShowPasswordButton() {
        return this.showPasswordButton;
    }

    public NativeInputConfiguration setAutoComplete(String[] strArr) {
        this.autoComplete = strArr;
        return this;
    }

    public NativeInputConfiguration setMaxLength(Integer num) {
        this.maxLength = num;
        return this;
    }

    public NativeInputConfiguration setMultiLine(boolean z) {
        this.isMultiLine = z;
        return this;
    }

    public NativeInputConfiguration setPlaceholder(String str) {
        this.placeholder = str;
        return this;
    }

    public NativeInputConfiguration setPreventCorrection(boolean z) {
        this.preventCorrection = z;
        return this;
    }

    public NativeInputConfiguration setShowPasswordButton(boolean z) {
        this.showPasswordButton = z;
        return this;
    }

    public NativeInputConfiguration setTextInputWrapper(TextInputWrapper textInputWrapper) {
        this.textInputWrapper = textInputWrapper;
        return this;
    }

    public NativeInputConfiguration setType(Input.OnscreenKeyboardType onscreenKeyboardType) {
        this.type = onscreenKeyboardType;
        return this;
    }

    public NativeInputConfiguration setValidator(Input.InputStringValidator inputStringValidator) {
        this.validator = inputStringValidator;
        return this;
    }

    public void validate() {
        Input.OnscreenKeyboardType onscreenKeyboardType = this.type;
        String str = onscreenKeyboardType == null ? "OnscreenKeyboardType needs to be non null" : null;
        if (this.textInputWrapper == null) {
            str = "TextInputWrapper needs to be non null";
        }
        if (this.showPasswordButton && onscreenKeyboardType != Input.OnscreenKeyboardType.Password) {
            str = "ShowPasswordButton only works with OnscreenKeyboardType.Password";
        }
        if (this.placeholder == null) {
            str = "Placeholder needs to be non null";
        }
        String[] strArr = this.autoComplete;
        if (strArr != null && onscreenKeyboardType != Input.OnscreenKeyboardType.Default) {
            str = "AutoComplete should only be used with OnscreenKeyboardType.Default";
        }
        if (strArr != null && this.isMultiLine) {
            str = "AutoComplete shouldn't be used with multiline";
        }
        if (str != null) {
            throw new IllegalArgumentException("NativeInputConfiguration validation failed: ".concat(str));
        }
    }
}
