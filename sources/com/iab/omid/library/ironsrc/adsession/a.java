package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.internal.c;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.internal.f;
import com.iab.omid.library.ironsrc.internal.i;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.b;
import com.iab.omid.library.ironsrc.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f25204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f25205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f25206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.weakreference.a f25207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f25208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f25209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f25211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f25214k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f25212i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f25213j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f25210g) {
            return;
        }
        this.f25206c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f25207d.get();
    }

    public List<e> d() {
        return this.f25206c.a();
    }

    public boolean e() {
        return this.f25214k != null;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f25210g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f25209f && !this.f25210g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void finish() {
        if (this.f25210g) {
            return;
        }
        this.f25207d.clear();
        removeAllFriendlyObstructions();
        this.f25210g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f25208e = null;
        this.f25214k = null;
    }

    public boolean g() {
        return this.f25210g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public String getAdSessionId() {
        return this.f25211h;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f25208e;
    }

    public boolean h() {
        return this.f25205b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f25205b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f25209f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f25212i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f25213j = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f25210g || c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f25210g) {
            return;
        }
        this.f25206c.b();
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f25210g) {
            return;
        }
        this.f25206c.c(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f25214k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void start() {
        if (this.f25209f || this.f25208e == null) {
            return;
        }
        this.f25209f = true;
        c.c().c(this);
        this.f25208e.a(i.c().b());
        this.f25208e.a(com.iab.omid.library.ironsrc.internal.a.a().b());
        this.f25208e.a(this, this.f25204a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f25206c = new f();
        this.f25209f = false;
        this.f25210g = false;
        this.f25205b = adSessionConfiguration;
        this.f25204a = adSessionContext;
        this.f25211h = str;
        b(null);
        this.f25208e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.ironsrc.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f25208e.i();
        c.c().a(this);
        this.f25208e.a(adSessionConfiguration);
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f25207d.clear();
            }
        }
    }

    private void b(@Nullable View view) {
        this.f25207d = new com.iab.omid.library.ironsrc.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.ironsrc.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.ironsrc.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f25214k.onPossibleObstructionsDetected(this.f25211h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f25213j = true;
    }
}
