package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Os;
import com.badlogic.gdx.utils.SharedLibraryLoader;

/* JADX INFO: loaded from: classes.dex */
public final class UIUtils {
    public static boolean isAndroid;
    public static boolean isIos;
    public static boolean isLinux;
    public static boolean isMac;
    public static boolean isWindows;

    static {
        isAndroid = SharedLibraryLoader.os == Os.Android;
        isMac = SharedLibraryLoader.os == Os.MacOsX;
        isWindows = SharedLibraryLoader.os == Os.Windows;
        isLinux = SharedLibraryLoader.os == Os.Linux;
        isIos = SharedLibraryLoader.os == Os.IOS;
    }

    private UIUtils() {
    }

    public static boolean alt(int i) {
        return i == 57 || i == 58;
    }

    public static boolean ctrl() {
        if (isMac) {
            return Gdx.input.isKeyPressed(63);
        }
        return Gdx.input.isKeyPressed(129) || Gdx.input.isKeyPressed(130);
    }

    public static boolean left(int i) {
        return i == 0;
    }

    public static boolean middle(int i) {
        return i == 2;
    }

    public static boolean right(int i) {
        return i == 1;
    }

    public static boolean shift(int i) {
        return i == 59 || i == 60;
    }

    public static boolean alt() {
        return Gdx.input.isKeyPressed(57) || Gdx.input.isKeyPressed(58);
    }

    public static boolean left() {
        return Gdx.input.isButtonPressed(0);
    }

    public static boolean middle() {
        return Gdx.input.isButtonPressed(2);
    }

    public static boolean right() {
        return Gdx.input.isButtonPressed(1);
    }

    public static boolean shift() {
        return Gdx.input.isKeyPressed(59) || Gdx.input.isKeyPressed(60);
    }

    public static boolean ctrl(int i) {
        if (isMac) {
            return i == 63;
        }
        return i == 129 || i == 130;
    }
}
