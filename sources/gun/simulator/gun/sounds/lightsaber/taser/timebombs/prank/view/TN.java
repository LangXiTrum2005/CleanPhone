package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class TN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3770a = 2;
    public final String b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Comparable g;
    public final Comparable h;
    public final Object i;

    public TN(Ig0 ig0, WebView webView, String str, List list, R2 r2) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = new HashMap();
        this.c = ig0;
        this.d = webView;
        this.b = str;
        this.i = r2;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3632hh0 c3632hh0 = (C3632hh0) it.next();
                ((Map) this.f).put(UUID.randomUUID().toString(), c3632hh0);
            }
        }
        this.h = null;
        this.g = null;
    }

    public static TN a(Ig0 ig0, String str, List list, String str2, String str3) {
        AbstractC2995aW.d(str, "OM SDK JS script content is null");
        AbstractC2995aW.d(list, "VerificationScriptResources is null");
        if (str3 == null || str3.length() <= 256) {
            return new TN(ig0, null, str, list, str2, str3, S2.NATIVE);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }

    public final Map b() {
        switch (this.f3770a) {
            case 1:
                break;
        }
        return Collections.unmodifiableMap((Map) this.f);
    }

    public TN(Ig0 ig0, WebView webView, String str, List list, String str2, String str3, S2 s2) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = new HashMap();
        this.c = ig0;
        this.d = webView;
        this.b = str;
        this.i = s2;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3719ih0 c3719ih0 = (C3719ih0) it.next();
                ((Map) this.f).put(UUID.randomUUID().toString(), c3719ih0);
            }
        }
        this.h = str2;
        this.g = str3;
    }
}
