package com.p004ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0006\u0010\u0007\u001a\u00020\fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/ironsource/w;", "Lcom/ironsource/ku;", "Lorg/json/JSONObject;", "Lcom/ironsource/iu;", "Lcom/ironsource/u;", "historyEvent", "", "b", "record", "a", "Lcom/ironsource/ju;", d9.a.t, "", "", "", "Lcom/ironsource/f2;", "Ljava/util/Map;", "adUnitsHistory", "", "I", "_currentlyLoadedAds", "()I", "currentlyLoadedAds", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class C3386w implements ku<JSONObject>, iu<C3384u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, f2> adUnitsHistory = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int _currentlyLoadedAds;

    /* JADX INFO: renamed from: com.ironsource.w$a */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27555a;

        static {
            int[] iArr = new int[hu.values().length];
            try {
                iArr[hu.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hu.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hu.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[hu.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[hu.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f27555a = iArr;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int get_currentlyLoadedAds() {
        return this._currentlyLoadedAds;
    }

    @Override // com.p004ironsource.ef
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(ju mode) throws JSONException {
        Intrinsics.f(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, f2> entry : this.adUnitsHistory.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectA = entry.getValue().a(mode);
            if (jSONObjectA.length() > 0) {
                jSONObject.put(key, jSONObjectA);
            }
        }
        return jSONObject;
    }

    private final void b(C3384u historyEvent) {
        int i2;
        int i3;
        int i4 = a.f27555a[historyEvent.getRecordType().ordinal()];
        if (i4 == 2) {
            i2 = this._currentlyLoadedAds + 1;
        } else if ((i4 != 3 && i4 != 4 && i4 != 5) || (i3 = this._currentlyLoadedAds) <= 0) {
            return;
        } else {
            i2 = i3 - 1;
        }
        this._currentlyLoadedAds = i2;
    }

    @Override // com.p004ironsource.iu
    public void a(C3384u record) {
        Intrinsics.f(record, "record");
        String adUnitId = record.getAdUnitId();
        Map<String, f2> map = this.adUnitsHistory;
        f2 f2Var = map.get(adUnitId);
        if (f2Var == null) {
            f2Var = new f2();
            map.put(adUnitId, f2Var);
        }
        f2Var.a(record.a(new C3385v()));
        b(record);
    }

    public final boolean b() {
        return !this.adUnitsHistory.isEmpty();
    }
}
