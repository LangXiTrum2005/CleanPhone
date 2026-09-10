package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class GLVersion {
    private final String TAG = "GLVersion";
    private int majorVersion;
    private int minorVersion;
    private int releaseVersion;
    private final String rendererString;
    private final Type type;
    private final String vendorString;
    private final String versionString;

    public enum Type {
        OpenGL,
        GLES,
        WebGL,
        NONE
    }

    public GLVersion(Application.ApplicationType applicationType, String str, String str2, String str3) {
        if (applicationType == Application.ApplicationType.Android || applicationType == Application.ApplicationType.iOS) {
            this.type = Type.GLES;
        } else if (applicationType == Application.ApplicationType.Desktop || applicationType == Application.ApplicationType.Applet) {
            this.type = Type.OpenGL;
        } else if (applicationType == Application.ApplicationType.WebGL) {
            this.type = Type.WebGL;
        } else {
            this.type = Type.NONE;
        }
        Type type = this.type;
        if (type == Type.GLES) {
            extractVersion("OpenGL ES (\\d(\\.\\d){0,2})", str);
        } else if (type == Type.WebGL) {
            extractVersion("WebGL (\\d(\\.\\d){0,2})", str);
        } else if (type == Type.OpenGL) {
            extractVersion("(\\d(\\.\\d){0,2})", str);
        } else {
            this.majorVersion = -1;
            this.minorVersion = -1;
            this.releaseVersion = -1;
            str2 = "";
            str3 = "";
        }
        this.versionString = str;
        this.vendorString = str2;
        this.rendererString = str3;
    }

    private void extractVersion(String str, String str2) {
        Matcher matcher = Pattern.compile(str).matcher(str2);
        if (matcher.find()) {
            String[] strArrSplit = matcher.group(1).split("\\.");
            this.majorVersion = parseInt(strArrSplit[0], 2);
            this.minorVersion = strArrSplit.length < 2 ? 0 : parseInt(strArrSplit[1], 0);
            this.releaseVersion = strArrSplit.length >= 3 ? parseInt(strArrSplit[2], 0) : 0;
            return;
        }
        Gdx.app.log("GLVersion", "Invalid version string: " + str2);
        this.majorVersion = 2;
        this.minorVersion = 0;
        this.releaseVersion = 0;
    }

    private int parseInt(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            Gdx.app.error("libGDX GL", "Error parsing number: " + str + ", assuming: " + i);
            return i;
        }
    }

    public String getDebugVersionString() {
        return "Type: " + this.type + "\nVersion: " + this.majorVersion + ":" + this.minorVersion + ":" + this.releaseVersion + "\nVendor: " + this.vendorString + "\nRenderer: " + this.rendererString;
    }

    public int getMajorVersion() {
        return this.majorVersion;
    }

    public int getMinorVersion() {
        return this.minorVersion;
    }

    public int getReleaseVersion() {
        return this.releaseVersion;
    }

    public String getRendererString() {
        return this.rendererString;
    }

    public Type getType() {
        return this.type;
    }

    public String getVendorString() {
        return this.vendorString;
    }

    public String getVersionString() {
        return this.versionString;
    }

    public boolean isVersionEqualToOrHigher(int i, int i2) {
        int i3 = this.majorVersion;
        return i3 > i || (i3 == i && this.minorVersion >= i2);
    }
}
