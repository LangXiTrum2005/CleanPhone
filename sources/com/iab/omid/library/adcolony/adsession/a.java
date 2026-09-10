package com.iab.omid.library.adcolony.adsession;

import android.view.View;
import com.iab.omid.library.adcolony.b.c;
import com.iab.omid.library.adcolony.b.f;
import com.iab.omid.library.adcolony.d.e;
import com.iab.omid.library.adcolony.publisher.AdSessionStatePublisher;
import com.iab.omid.library.adcolony.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f21448a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionContext f21449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdSessionConfiguration f21450c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.adcolony.e.a f21451e;
    private AdSessionStatePublisher f;
    private boolean j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PossibleObstructionListener f21454l;
    private final List<c> d = new ArrayList();
    private boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21452h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21453i = UUID.randomUUID().toString();

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f21450c = adSessionConfiguration;
        this.f21449b = adSessionContext;
        c(null);
        this.f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.adcolony.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f.a();
        com.iab.omid.library.adcolony.b.a.a().a(this);
        this.f.a(adSessionConfiguration);
    }

    private c a(View view) {
        for (c cVar : this.d) {
            if (cVar.a().get() == view) {
                return cVar;
            }
        }
        return null;
    }

    private static void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void k() {
        if (this.j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void l() {
        if (this.k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f21452h) {
            return;
        }
        b(view);
        a(str);
        if (a(view) == null) {
            this.d.add(new c(view, friendlyObstructionPurpose, str));
        }
    }

    public void c() {
        k();
        getAdSessionStatePublisher().g();
        this.j = true;
    }

    public void d() {
        l();
        getAdSessionStatePublisher().h();
        this.k = true;
    }

    public View e() {
        return this.f21451e.get();
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f21452h) {
            throw new IllegalStateException("AdSession is finished");
        }
        e.a(errorType, "Error type is null");
        e.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.g && !this.f21452h;
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public void finish() {
        if (this.f21452h) {
            return;
        }
        this.f21451e.clear();
        removeAllFriendlyObstructions();
        this.f21452h = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.adcolony.b.a.a().c(this);
        getAdSessionStatePublisher().b();
        this.f = null;
        this.f21454l = null;
    }

    public boolean g() {
        return this.g;
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public String getAdSessionId() {
        return this.f21453i;
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f;
    }

    public boolean h() {
        return this.f21452h;
    }

    public boolean i() {
        return this.f21450c.isNativeImpressionOwner();
    }

    public boolean j() {
        return this.f21450c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f21452h) {
            return;
        }
        e.a(view, "AdView is null");
        if (e() == view) {
            return;
        }
        c(view);
        getAdSessionStatePublisher().i();
        d(view);
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f21452h) {
            return;
        }
        this.d.clear();
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f21452h) {
            return;
        }
        b(view);
        c cVarA = a(view);
        if (cVarA != null) {
            this.d.remove(cVarA);
        }
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f21454l = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public void start() {
        if (this.g) {
            return;
        }
        this.g = true;
        com.iab.omid.library.adcolony.b.a.a().b(this);
        this.f.a(f.a().d());
        this.f.a(this, this.f21449b);
    }

    private void c(View view) {
        this.f21451e = new com.iab.omid.library.adcolony.e.a(view);
    }

    private void d(View view) {
        Collection<a> collectionB = com.iab.omid.library.adcolony.b.a.a().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f21451e.clear();
            }
        }
    }

    public List<c> a() {
        return this.d;
    }

    public boolean b() {
        return this.f21454l != null;
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f21448a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    public void a(List<com.iab.omid.library.adcolony.e.a> list) {
        if (b()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.adcolony.e.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f21454l.onPossibleObstructionsDetected(this.f21453i, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        l();
        getAdSessionStatePublisher().a(jSONObject);
        this.k = true;
    }
}
