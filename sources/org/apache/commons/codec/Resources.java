package org.apache.commons.codec;

import android.support.v4.media.a;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class Resources {
    public static InputStream a(String str) {
        InputStream resourceAsStream = Resources.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        throw new IllegalArgumentException(a.C("Unable to resolve required resource: ", str));
    }
}
