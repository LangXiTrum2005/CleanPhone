package com.airbnb.lottie.model;

import androidx.media3.extractor.text.ttml.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class KeyPath {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KeyPath f9727c = new KeyPath("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public KeyPathElement f9729b;

    public KeyPath(String... strArr) {
        this.f9728a = Arrays.asList(strArr);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007e A[RETURN] */
    public final boolean a(int i2, String str) {
        List list = this.f9728a;
        if (i2 < list.size()) {
            boolean z2 = i2 == list.size() - 1;
            String str2 = (String) list.get(i2);
            if (!str2.equals("**")) {
                boolean z3 = str2.equals(str) || str2.equals("*");
                if ((z2 || (i2 == list.size() - 2 && ((String) a.h(1, list)).equals("**"))) && z3) {
                    return true;
                }
            } else {
                if (z2 || !((String) list.get(i2 + 1)).equals(str)) {
                    if (!z2) {
                        int i3 = i2 + 1;
                        if (i3 >= list.size() - 1) {
                            return ((String) list.get(i3)).equals(str);
                        }
                    }
                    return true;
                }
                if (i2 == list.size() - 2 || (i2 == list.size() - 3 && ((String) a.h(1, list)).equals("**"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(int i2, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f9728a;
        if (((String) list.get(i2)).equals("**")) {
            return (i2 != list.size() - 1 && ((String) list.get(i2 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i2, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f9728a;
        if (i2 >= list.size()) {
            return false;
        }
        return ((String) list.get(i2)).equals(str) || ((String) list.get(i2)).equals("**") || ((String) list.get(i2)).equals("*");
    }

    public final boolean d(int i2, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f9728a;
        return i2 < list.size() - 1 || ((String) list.get(i2)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            KeyPath keyPath = (KeyPath) obj;
            if (!this.f9728a.equals(keyPath.f9728a)) {
                return false;
            }
            KeyPathElement keyPathElement = this.f9729b;
            KeyPathElement keyPathElement2 = keyPath.f9729b;
            if (keyPathElement != null) {
                return keyPathElement.equals(keyPathElement2);
            }
            if (keyPathElement2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9728a.hashCode() * 31;
        KeyPathElement keyPathElement = this.f9729b;
        return iHashCode + (keyPathElement != null ? keyPathElement.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f9728a);
        sb.append(",resolved=");
        return a.r(sb, this.f9729b != null, AbstractJsonLexerKt.END_OBJ);
    }

    public KeyPath(KeyPath keyPath) {
        this.f9728a = new ArrayList(keyPath.f9728a);
        this.f9729b = keyPath.f9729b;
    }
}
