package com.bytedance.sdk.component.Lxb;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class DY {
    private JVA.Lxb JXs;
    private final Set<String> LD;
    private final Set<String> Lxb;
    private final Sfi ZU;
    private final HD lk = kqm.Lxb;

    public DY(Sfi sfi, Set<String> set, Set<String> set2) {
        this.ZU = sfi;
        if (set == null || set.isEmpty()) {
            this.Lxb = new LinkedHashSet();
        } else {
            this.Lxb = new LinkedHashSet(set);
        }
        if (set2 == null || set2.isEmpty()) {
            this.LD = new LinkedHashSet();
        } else {
            this.LD = new LinkedHashSet(set2);
        }
    }

    public final synchronized eK LD(String str, LD ld) {
        return Lxb(str, ld, false);
    }

    public final synchronized eK Lxb(boolean z, String str, LD ld) throws Sfi.Lxb {
        JVA.Lxb lxb;
        try {
            Uri uri = Uri.parse(str);
            String host = uri.getHost();
            if (host == null) {
                return null;
            }
            eK eKVar = this.LD.contains(ld.Lxb()) ? eK.PUBLIC : null;
            for (String str2 : this.Lxb) {
                if (uri.getHost().equals(str2) || host.endsWith(".".concat(String.valueOf(str2)))) {
                    eKVar = eK.PRIVATE;
                    break;
                }
            }
            if (eKVar == null && (lxb = this.JXs) != null && lxb.Lxb(str)) {
                if (this.JXs.Lxb(str, ld.Lxb())) {
                    return null;
                }
                eKVar = eK.PRIVATE;
            }
            eK eKVarLxb = z ? Lxb(str, ld) : LD(str, ld);
            return eKVarLxb != null ? eKVarLxb : eKVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void LD(HD.Lxb lxb) {
        if (this.lk != null) {
            throw null;
        }
    }

    public final synchronized eK Lxb(String str, LD ld) throws Sfi.Lxb {
        return Lxb(str, ld, true);
    }

    public void Lxb(JVA.Lxb lxb) {
        this.JXs = lxb;
    }

    public void Lxb(HD.Lxb lxb) {
        if (this.lk != null) {
            throw null;
        }
    }

    private eK Lxb(String str, LD ld, boolean z) {
        if (!z || this.ZU == null) {
            return null;
        }
        throw null;
    }
}
