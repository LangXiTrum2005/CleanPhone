package com.facebook.internal.security;

import android.util.Base64;
import android.util.Log;
import com.applovin.shadow.okio.Segment;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/security/OidcSecurityUtil;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class OidcSecurityUtil {
    public static final PublicKey a(String str) throws InvalidKeySpecException {
        byte[] bArrDecode = Base64.decode(StringsKt.I(StringsKt.I(StringsKt.I(str, IOUtils.LINE_SEPARATOR_UNIX, ""), "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", ""), 0);
        Intrinsics.e(bArrDecode, "Base64.decode(pubKeyString, Base64.DEFAULT)");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        Intrinsics.e(publicKeyGeneratePublic, "kf.generatePublic(x509publicKey)");
        return publicKeyGeneratePublic;
    }

    public static final String b(final String kid) {
        Intrinsics.f(kid, "kid");
        final URL url = new URL(HttpRequest.DEFAULT_SCHEME, "www." + FacebookSdk.r, "/.well-known/oauth/openid/keys/");
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.X = null;
        FacebookSdk.e().execute(new Runnable() { // from class: com.facebook.internal.security.OidcSecurityUtil$getRawKeyFromEndPoint$1
            @Override // java.lang.Runnable
            public final void run() {
                Condition condition = conditionNewCondition;
                ReentrantLock reentrantLock2 = reentrantLock;
                if (CrashShieldHandler.b(this)) {
                    return;
                }
                try {
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    if (uRLConnectionOpenConnection == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    try {
                        try {
                            InputStream inputStream = httpURLConnection.getInputStream();
                            Intrinsics.e(inputStream, "connection.inputStream");
                            String strB = TextStreamsKt.b(new BufferedReader(new InputStreamReader(inputStream, Charsets.f44691a), Segment.SIZE));
                            httpURLConnection.getInputStream().close();
                            objectRef.X = new JSONObject(strB).optString(kid);
                            httpURLConnection.disconnect();
                            reentrantLock2.lock();
                            try {
                                condition.signal();
                            } finally {
                                reentrantLock2.unlock();
                            }
                        } catch (Throwable th) {
                            httpURLConnection.disconnect();
                            reentrantLock2.lock();
                            try {
                                condition.signal();
                                throw th;
                            } finally {
                                reentrantLock2.unlock();
                            }
                        }
                    } catch (Exception e2) {
                        String name = OidcSecurityUtil.class.getName();
                        String message = e2.getMessage();
                        if (message == null) {
                            message = "Error getting public key";
                        }
                        Log.d(name, message);
                        httpURLConnection.disconnect();
                        reentrantLock2.lock();
                        try {
                            condition.signal();
                        } finally {
                            reentrantLock2.unlock();
                        }
                    }
                } catch (Throwable th2) {
                    CrashShieldHandler.a(this, th2);
                }
            }
        });
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            return (String) objectRef.X;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final boolean c(PublicKey publicKey, String data, String signature) {
        Intrinsics.f(data, "data");
        Intrinsics.f(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(Charsets.f44691a);
            Intrinsics.e(bytes, "(this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] bArrDecode = Base64.decode(signature, 8);
            Intrinsics.e(bArrDecode, "Base64.decode(signature, Base64.URL_SAFE)");
            return signature2.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }
}
