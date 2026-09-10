package com.iab.omid.library.mmadbridge.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.internal.c;
import com.iab.omid.library.mmadbridge.internal.e;
import com.iab.omid.library.mmadbridge.internal.f;
import com.iab.omid.library.mmadbridge.internal.i;
import com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher;
import com.iab.omid.library.mmadbridge.publisher.b;
import com.iab.omid.library.mmadbridge.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f25338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f25339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f25340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.weakreference.a f25341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f25342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f25343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f25345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f25348k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f25346i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f25347j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f25344g) {
            return;
        }
        this.f25340c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f25341d.get();
    }

    public List<e> d() {
        return this.f25340c.a();
    }

    public boolean e() {
        return this.f25348k != null;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f25344g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f25343f && !this.f25344g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void finish() {
        if (this.f25344g) {
            return;
        }
        this.f25341d.clear();
        removeAllFriendlyObstructions();
        this.f25344g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f25342e = null;
        this.f25348k = null;
    }

    public boolean g() {
        return this.f25344g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public String getAdSessionId() {
        return this.f25345h;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f25342e;
    }

    public boolean h() {
        return this.f25339b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f25339b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f25343f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f25346i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f25347j = true;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f25344g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f25344g) {
            return;
        }
        this.f25340c.b();
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f25344g) {
            return;
        }
        this.f25340c.c(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f25348k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void start() {
        if (this.f25343f) {
            return;
        }
        this.f25343f = true;
        c.c().c(this);
        this.f25342e.a(i.c().b());
        this.f25342e.a(com.iab.omid.library.mmadbridge.internal.a.a().b());
        this.f25342e.a(this, this.f25338a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f25340c = new f();
        this.f25343f = false;
        this.f25344g = false;
        this.f25339b = adSessionConfiguration;
        this.f25338a = adSessionContext;
        this.f25345h = str;
        b(null);
        this.f25342e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.mmadbridge.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f25342e.i();
        c.c().a(this);
        this.f25342e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f25341d.clear();
            }
        }
    }

    private void b(View view) {
        this.f25341d = new com.iab.omid.library.mmadbridge.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.mmadbridge.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.mmadbridge.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f25348k.onPossibleObstructionsDetected(this.f25345h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f25347j = true;
    }
}
