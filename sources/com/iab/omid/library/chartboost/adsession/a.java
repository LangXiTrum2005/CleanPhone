package com.iab.omid.library.chartboost.adsession;

import android.view.View;
import com.iab.omid.library.chartboost.internal.c;
import com.iab.omid.library.chartboost.internal.e;
import com.iab.omid.library.chartboost.internal.f;
import com.iab.omid.library.chartboost.internal.i;
import com.iab.omid.library.chartboost.publisher.AdSessionStatePublisher;
import com.iab.omid.library.chartboost.publisher.b;
import com.iab.omid.library.chartboost.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f21819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f21820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f21821c;
    private com.iab.omid.library.chartboost.weakreference.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f21822e;
    private boolean f;
    private boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21824i;
    private boolean j;
    private PossibleObstructionListener k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f21824i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.g) {
            return;
        }
        this.f21821c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f21823h;
    }

    public AdSessionStatePublisher d() {
        return this.f21822e;
    }

    public View e() {
        return this.d.get();
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f21821c.a();
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void finish() {
        if (this.g) {
            return;
        }
        this.d.clear();
        removeAllFriendlyObstructions();
        this.g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f21822e = null;
        this.k = null;
    }

    public boolean g() {
        return this.k != null;
    }

    public boolean h() {
        return this.f && !this.g;
    }

    public boolean i() {
        return this.g;
    }

    public boolean j() {
        return this.f21820b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f21820b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f;
    }

    public void m() {
        a();
        d().g();
        this.f21824i = true;
    }

    public void n() {
        b();
        d().h();
        this.j = true;
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void registerAdView(View view) {
        if (this.g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.g) {
            return;
        }
        this.f21821c.b();
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.g) {
            return;
        }
        this.f21821c.c(view);
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void start() {
        if (this.f || this.f21822e == null) {
            return;
        }
        this.f = true;
        c.c().c(this);
        this.f21822e.a(i.c().b());
        this.f21822e.a(com.iab.omid.library.chartboost.internal.a.a().b());
        this.f21822e.a(this, this.f21819a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f21821c = new f();
        this.f = false;
        this.g = false;
        this.f21820b = adSessionConfiguration;
        this.f21819a = adSessionContext;
        this.f21823h = str;
        b(null);
        this.f21822e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.chartboost.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f21822e.i();
        c.c().a(this);
        this.f21822e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.d.clear();
            }
        }
    }

    private void b(View view) {
        this.d = new com.iab.omid.library.chartboost.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.chartboost.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.chartboost.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.k.onPossibleObstructionsDetected(this.f21823h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.j = true;
    }
}
