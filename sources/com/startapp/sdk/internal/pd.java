package com.startapp.sdk.internal;

import com.startapp.sdk.common.SDKException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class pd extends ve {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f41367b;

    public pd(Set set) {
        super(set);
        this.f41367b = new LinkedHashMap();
    }

    @Override // com.startapp.sdk.internal.ve
    public final void a(String str, Object obj, boolean z2, boolean z3) throws SDKException {
        String string;
        if (this.f41583a.contains(str)) {
            return;
        }
        try {
            if (obj instanceof ue) {
                string = ((ue) obj).b();
            } else {
                string = obj != null ? obj.toString() : null;
            }
            if (string == null) {
                if (z2) {
                    throw new SDKException(str);
                }
            } else {
                if (z3) {
                    string = URLEncoder.encode(string, "UTF-8");
                }
                this.f41367b.put(str, string);
            }
        } catch (UnsupportedEncodingException e2) {
            if (z2) {
                throw new SDKException(str, e2);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('?');
        for (Map.Entry entry : this.f41367b.entrySet()) {
            if (entry.getValue() instanceof String) {
                sb.append((String) entry.getKey());
                sb.append(com.p004ironsource.dc.T);
                sb.append(entry.getValue());
                sb.append('&');
            } else if (entry.getValue() instanceof Set) {
                for (Object obj : (Set) entry.getValue()) {
                    if (obj instanceof String) {
                        sb.append((String) entry.getKey());
                        sb.append(com.p004ironsource.dc.T);
                        sb.append(obj);
                        sb.append('&');
                    }
                }
            }
        }
        if (sb.length() != 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString().replace("+", "%20");
    }

    @Override // com.startapp.sdk.internal.ve
    public final void a(String str, Set set) {
        if (this.f41583a.contains(str) || set == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add(URLEncoder.encode((String) it.next(), "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.f41367b.put(str, hashSet);
    }
}
