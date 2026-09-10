package com.iab.omid.library.bigosg.adsession;

import android.view.View;
import com.iab.omid.library.bigosg.b.c;
import com.iab.omid.library.bigosg.b.f;
import com.iab.omid.library.bigosg.d.e;
import com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bigosg.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f21636a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionContext f21637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdSessionConfiguration f21638c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bigosg.e.a f21639e;
    private AdSessionStatePublisher f;
    private boolean j;
    private boolean k;
    private final List<c> d = new ArrayList();
    private boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21640h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f21641i = UUID.randomUUID().toString();

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f21638c = adSessionConfiguration;
        this.f21637b = adSessionContext;
        c(null);
        this.f = adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML ? new com.iab.omid.library.bigosg.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f.a();
        com.iab.omid.library.bigosg.b.a.a().a(this);
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

    private void j() {
        if (this.j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void k() {
        if (this.k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void addFriendlyObstruction(View view) {
        addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, null);
    }

    public void b() {
        j();
        getAdSessionStatePublisher().g();
        this.j = true;
    }

    public void c() {
        k();
        getAdSessionStatePublisher().h();
        this.k = true;
    }

    public View d() {
        return this.f21639e.get();
    }

    public boolean e() {
        return this.g && !this.f21640h;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f21640h) {
            throw new IllegalStateException("AdSession is finished");
        }
        e.a(errorType, "Error type is null");
        e.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.g;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void finish() {
        if (this.f21640h) {
            return;
        }
        this.f21639e.clear();
        removeAllFriendlyObstructions();
        this.f21640h = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.bigosg.b.a.a().c(this);
        getAdSessionStatePublisher().b();
        this.f = null;
    }

    public boolean g() {
        return this.f21640h;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public String getAdSessionId() {
        return this.f21641i;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f;
    }

    public boolean h() {
        return this.f21638c.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f21638c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f21640h) {
            return;
        }
        e.a(view, "AdView is null");
        if (d() == view) {
            return;
        }
        c(view);
        getAdSessionStatePublisher().i();
        d(view);
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f21640h) {
            return;
        }
        this.d.clear();
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f21640h) {
            return;
        }
        b(view);
        c cVarA = a(view);
        if (cVarA != null) {
            this.d.remove(cVarA);
        }
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void start() {
        if (this.g) {
            return;
        }
        this.g = true;
        com.iab.omid.library.bigosg.b.a.a().b(this);
        this.f.a(f.a().d());
        this.f.a(this, this.f21637b);
    }

    private void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void c(View view) {
        this.f21639e = new com.iab.omid.library.bigosg.e.a(view);
    }

    private void d(View view) {
        Collection<a> collectionB = com.iab.omid.library.bigosg.b.a.a().b();
        if (collectionB == null || collectionB.size() <= 0) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.d() == view) {
                aVar.f21639e.clear();
            }
        }
    }

    public List<c> a() {
        return this.d;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f21640h) {
            return;
        }
        b(view);
        a(str);
        if (a(view) == null) {
            this.d.add(new c(view, friendlyObstructionPurpose, str));
        }
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50 || !f21636a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
            }
        }
    }

    public void a(JSONObject jSONObject) {
        k();
        getAdSessionStatePublisher().a(jSONObject);
        this.k = true;
    }
}
