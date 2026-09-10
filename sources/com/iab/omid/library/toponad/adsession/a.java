package com.iab.omid.library.toponad.adsession;

import android.view.View;
import com.iab.omid.library.toponad.internal.c;
import com.iab.omid.library.toponad.internal.e;
import com.iab.omid.library.toponad.internal.f;
import com.iab.omid.library.toponad.internal.i;
import com.iab.omid.library.toponad.publisher.AdSessionStatePublisher;
import com.iab.omid.library.toponad.publisher.b;
import com.iab.omid.library.toponad.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f22320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f22321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f22322c;
    private com.iab.omid.library.toponad.weakreference.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f22323e;
    private boolean f;
    private boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22325i;
    private boolean j;
    private PossibleObstructionListener k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f22325i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.g) {
            return;
        }
        this.f22322c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.d.get();
    }

    public List<e> d() {
        return this.f22322c.a();
    }

    public boolean e() {
        return this.k != null;
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f && !this.g;
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public void finish() {
        if (this.g) {
            return;
        }
        this.d.clear();
        removeAllFriendlyObstructions();
        this.g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f22323e = null;
        this.k = null;
    }

    public boolean g() {
        return this.g;
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public String getAdSessionId() {
        return this.f22324h;
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f22323e;
    }

    public boolean h() {
        return this.f22321b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f22321b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f22325i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.j = true;
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public void registerAdView(View view) {
        if (this.g || c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.g) {
            return;
        }
        this.f22322c.b();
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.g) {
            return;
        }
        this.f22322c.c(view);
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.toponad.adsession.AdSession
    public void start() {
        if (this.f || this.f22323e == null) {
            return;
        }
        this.f = true;
        c.c().c(this);
        this.f22323e.a(i.c().b());
        this.f22323e.a(com.iab.omid.library.toponad.internal.a.a().b());
        this.f22323e.a(this, this.f22320a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f22322c = new f();
        this.f = false;
        this.g = false;
        this.f22321b = adSessionConfiguration;
        this.f22320a = adSessionContext;
        this.f22324h = str;
        b(null);
        this.f22323e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.toponad.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f22323e.i();
        c.c().a(this);
        this.f22323e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.d.clear();
            }
        }
    }

    private void b(View view) {
        this.d = new com.iab.omid.library.toponad.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.toponad.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.toponad.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.k.onPossibleObstructionsDetected(this.f22324h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.j = true;
    }
}
