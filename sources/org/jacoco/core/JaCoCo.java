package org.jacoco.core;

import java.util.ResourceBundle;

/* JADX INFO: loaded from: classes5.dex */
public final class JaCoCo {
    public static final String COMMITID;
    public static final String COMMITID_SHORT;
    public static final String HOMEURL;
    public static final String RUNTIMEPACKAGE;
    public static final String VERSION;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("org.jacoco.core.jacoco");
        VERSION = bundle.getString("VERSION");
        String string = bundle.getString("COMMITID");
        COMMITID = string;
        COMMITID_SHORT = string.substring(0, 7);
        HOMEURL = bundle.getString("HOMEURL");
        RUNTIMEPACKAGE = bundle.getString("RUNTIMEPACKAGE");
    }

    private JaCoCo() {
    }
}
