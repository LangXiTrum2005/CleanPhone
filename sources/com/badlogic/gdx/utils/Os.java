package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes.dex */
public enum Os {
    Windows,
    Linux,
    MacOsX,
    Android,
    IOS;

    public String getJniPlatform() {
        if (this == Windows) {
            return "win32";
        }
        if (this == Linux) {
            return "linux";
        }
        return this == MacOsX ? "mac" : "";
    }

    public String getLibExtension() {
        if (this == Windows) {
            return "dll";
        }
        if (this == Linux) {
            return "so";
        }
        if (this == MacOsX) {
            return "dylib";
        }
        return this == Android ? "so" : "";
    }

    public String getLibPrefix() {
        return (this == Linux || this == Android || this == MacOsX) ? "lib" : "";
    }
}
