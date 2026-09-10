package com.google.firebase.messaging;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: TopicOperation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cultivated {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Pattern f22627wireman = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f22628attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f22629dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f22630saneness;

    public cultivated(String str, String str2) {
        this.f22628attabal = wireman(str2, str);
        this.f22630saneness = str;
        this.f22629dern = str + "!" + str2;
    }

    public static cultivated attabal(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new cultivated(strArrSplit[0], strArrSplit[1]);
    }

    public static cultivated beachfront(String str) {
        return new cultivated("S", str);
    }

    public static cultivated competently(String str) {
        return new cultivated("U", str);
    }

    public static String wireman(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2);
            str = str.substring(8);
        }
        if (str == null || !f22627wireman.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String dern() {
        return this.f22628attabal;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cultivated)) {
            return false;
        }
        cultivated cultivatedVar = (cultivated) obj;
        return this.f22628attabal.equals(cultivatedVar.f22628attabal) && this.f22630saneness.equals(cultivatedVar.f22630saneness);
    }

    public int hashCode() {
        return Objects.hashCode(this.f22630saneness, this.f22628attabal);
    }

    public String marial() {
        return this.f22629dern;
    }

    public String saneness() {
        return this.f22630saneness;
    }
}
