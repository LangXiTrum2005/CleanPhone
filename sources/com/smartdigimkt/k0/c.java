package com.smartdigimkt.k0;

import android.text.TextUtils;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36138b;

    public c(String str, String str2) {
        this.f36137a = str;
        this.f36138b = str2;
    }

    public final String a() {
        return this.f36137a;
    }

    public final String b() {
        return this.f36138b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (TextUtils.equals(this.f36137a, cVar.f36137a) && TextUtils.equals(this.f36138b, cVar.f36138b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f36138b.hashCode() + (this.f36137a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f36137a);
        sb.append(",value=");
        return android.support.v4.media.a.r(sb, this.f36138b, d9.i.f24752e);
    }
}
