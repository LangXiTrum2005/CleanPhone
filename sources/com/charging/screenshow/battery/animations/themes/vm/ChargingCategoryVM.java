package com.charging.screenshow.battery.animations.themes.vm;

import androidx.lifecycle.CloseableCoroutineScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.charging.screenshow.battery.animations.themes.entity.Charging3D;
import com.charging.screenshow.battery.animations.themes.entity.Layer3D;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/vm/ChargingCategoryVM;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChargingCategoryVM extends ViewModel {
    public final MutableLiveData d = new MutableLiveData();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f13345e = new ArrayList();
    public final AtomicBoolean f = new AtomicBoolean(false);

    public ChargingCategoryVM() {
        g();
    }

    public static String d() {
        try {
            InputStream inputStreamOpen = AppExt.a().getAssets().open("3d_.txt");
            Intrinsics.e(inputStreamOpen, "open(...)");
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[inputStreamOpen.available()];
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, StandardCharsets.UTF_8));
            while (true) {
                int i2 = bufferedReader.read(cArr);
                if (i2 == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String e() {
        try {
            InputStream inputStreamOpen = AppExt.a().getAssets().open("abc.json");
            Intrinsics.e(inputStreamOpen, "open(...)");
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[inputStreamOpen.available()];
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, StandardCharsets.UTF_8));
            while (true) {
                int i2 = bufferedReader.read(cArr);
                if (i2 == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i2);
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.length() != 0) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        Charging3D charging3D = new Charging3D();
                        charging3D.o(jSONObject.getLong("id"));
                        charging3D.n(jSONObject.getString("title"));
                        charging3D.e(charging3D.getTitle() + charging3D.getWallpaperId());
                        charging3D.m(jSONObject.getString("thumbnail"));
                        charging3D.k(jSONObject.getInt("category"));
                        JSONObject jSONObject2 = jSONObject.getJSONObject("pictures");
                        Layer3D layer3D = new Layer3D();
                        layer3D.i(jSONObject2.getString("layer1"));
                        layer3D.j(jSONObject2.getString("layer2"));
                        layer3D.k(jSONObject2.getString("layer3"));
                        charging3D.l(layer3D);
                        arrayList.add(charging3D);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return arrayList;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void b() {
    }

    public final void g() {
        Object obj;
        AtomicBoolean atomicBoolean = this.f;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        HashMap map = this.f5279a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = this.f5279a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
        }
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        if (coroutineScope == null) {
            Job jobB = SupervisorKt.b();
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineScope = (CoroutineScope) c(new CloseableCoroutineScope(CoroutineContext.Element.DefaultImpls.d((JobSupport) jobB, MainDispatcherLoader.f45042a.j0())), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        }
        DefaultScheduler defaultScheduler2 = Dispatchers.f44752a;
        BuildersKt.c(coroutineScope, DefaultIoScheduler.f45062Y, null, new ChargingCategoryVM$refresh$1(this, null), 2);
    }
}
