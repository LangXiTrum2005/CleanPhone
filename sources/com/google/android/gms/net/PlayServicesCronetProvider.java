package com.google.android.gms.net;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import fa.a;
import i9.f;
import i9.g;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import k9.c0;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import t9.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    @UsedByReflection("CronetAPI")
    public PlayServicesCronetProvider(@NonNull Context context) {
        super(context);
    }

    private void tryToInstallCronetProvider() {
        try {
            a.b(this.mContext);
        } catch (f unused) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        } catch (g unused2) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        }
    }

    @Override // org.chromium.net.CronetProvider
    @NonNull
    @Keep
    public CronetEngine.Builder createBuilder() {
        ExperimentalCronetEngine.Builder builder;
        d dVar;
        try {
            a.b(this.mContext);
            Throwable th2 = null;
            try {
                synchronized (a.f40715b) {
                    dVar = a.f40716c;
                }
                c0.h(dVar);
                ClassLoader classLoader = dVar.f50576a.getClassLoader();
                c0.h(classLoader);
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext));
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                builder = null;
                th2 = e10;
            }
            if (th2 != null) {
                throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", th2);
            }
            c0.i(builder, "The value of the constructed builder should never be null");
            return builder;
        } catch (f e11) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e11);
        } catch (g e12) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e12);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    @NonNull
    @Keep
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    @NonNull
    @Keep
    public String getVersion() {
        String str;
        tryToInstallCronetProvider();
        synchronized (a.f40715b) {
            str = a.f40717d;
        }
        return str;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public boolean isEnabled() {
        d dVar;
        tryToInstallCronetProvider();
        synchronized (a.f40715b) {
            dVar = a.f40716c;
        }
        return dVar != null;
    }
}
