package com.iab.omid.library.applovin.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.internal.i;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import com.iab.omid.library.applovin.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f25070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f25071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f25072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f25073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f25074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f25075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f25077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f25080k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f25078i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f25079j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f25076g) {
            return;
        }
        this.f25072c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f25077h;
    }

    public AdSessionStatePublisher d() {
        return this.f25074e;
    }

    public View e() {
        return this.f25073d.get();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f25076g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f25072c.a();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f25076g) {
            return;
        }
        this.f25073d.clear();
        removeAllFriendlyObstructions();
        this.f25076g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f25074e = null;
        this.f25080k = null;
    }

    public boolean g() {
        return this.f25080k != null;
    }

    public boolean h() {
        return this.f25075f && !this.f25076g;
    }

    public boolean i() {
        return this.f25076g;
    }

    public boolean j() {
        return this.f25071b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f25071b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f25075f;
    }

    public void m() {
        a();
        d().g();
        this.f25078i = true;
    }

    public void n() {
        b();
        d().h();
        this.f25079j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f25076g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f25076g) {
            return;
        }
        this.f25072c.b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f25076g) {
            return;
        }
        this.f25072c.c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f25080k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f25075f || this.f25074e == null) {
            return;
        }
        this.f25075f = true;
        c.c().c(this);
        this.f25074e.a(i.c().b());
        this.f25074e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.f25074e.a(this, this.f25070a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f25072c = new f();
        this.f25075f = false;
        this.f25076g = false;
        this.f25071b = adSessionConfiguration;
        this.f25070a = adSessionContext;
        this.f25077h = str;
        b(null);
        this.f25074e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f25074e.i();
        c.c().a(this);
        this.f25074e.a(adSessionConfiguration);
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f25073d.clear();
            }
        }
    }

    private void b(@Nullable View view) {
        this.f25073d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.applovin.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.applovin.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f25080k.onPossibleObstructionsDetected(this.f25077h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f25079j = true;
    }
}
