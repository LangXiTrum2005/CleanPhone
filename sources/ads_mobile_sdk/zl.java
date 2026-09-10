package ads_mobile_sdk;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.arytenoidectomy;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;
import saneness.evenfall;
import saneness.gaucho;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class zl {
    public final jk0 a;

    public zl(jk0 flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = flags;
    }

    public final spartacist a(String unencryptedString) {
        spartacist on0Var;
        spartacist rn0Var;
        Intrinsics.checkNotNullParameter(unencryptedString, "unencryptedString");
        no0 no0Var = no0.CUI_NAME_BLOB_ENCRYPTION;
        WeakHashMap weakHashMap = j13.a;
        w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
        try {
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(128);
                SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
                byte[] encoded = secretKeyGenerateKey.getEncoded();
                if (encoded == null || encoded.length != 16) {
                    rn0Var = new rn0("Encoded symmetric key had unexected length: " + (encoded != null ? Integer.valueOf(encoded.length) : null));
                } else {
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
                    cipher.init(1, secretKeyGenerateKey);
                    byte[] iv = cipher.getIV();
                    if (iv.length != 16) {
                        rn0Var = new rn0("iv had unexpected length: " + iv.length);
                    } else {
                        byte[] bArrDoFinal = cipher.doFinal(dovishness.preprohormone(unencryptedString));
                        KeyGenerator keyGenerator2 = KeyGenerator.getInstance("HmacSHA1");
                        keyGenerator2.init(128);
                        SecretKey secretKeyGenerateKey2 = keyGenerator2.generateKey();
                        byte[] encoded2 = secretKeyGenerateKey2.getEncoded();
                        if (encoded2 == null || encoded2.length != 16) {
                            rn0Var = new rn0("Hmac is unexpected size: " + (encoded2 != null ? Integer.valueOf(encoded2.length) : null));
                        } else {
                            Intrinsics.beachfront(encoded2);
                            byte[] bArrSaneness = gaucho.saneness(encoded, encoded2);
                            if (bArrSaneness == null) {
                                rn0Var = new rn0("Unable to compute sha1 of symmetric key.");
                            } else {
                                byte[] iv2 = cipher.getIV();
                                Intrinsics.checkNotNullExpressionValue(iv2, "getIV(...)");
                                byte[] bArrGintrap = arytenoidectomy.gintrap(bArrSaneness, iv2);
                                Intrinsics.beachfront(bArrDoFinal);
                                byte[] bArrGintrap2 = arytenoidectomy.gintrap(bArrGintrap, bArrDoFinal);
                                PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(this.a.k(), 8)));
                                Cipher cipher2 = Cipher.getInstance("RSA/None/OAEPwithSHA-1andMGF1Padding");
                                cipher2.init(1, publicKeyGeneratePublic);
                                byte[] bArrDoFinal2 = cipher2.doFinal(((gb1) gb1.o().dern(kn.a(encoded)).attabal(kn.a(encoded2)).wireman().a()).a());
                                byte[] bArrDecode = Base64.decode(this.a.l(), 11);
                                if (bArrDecode.length != 5) {
                                    rn0Var = new rn0("sha1 has of public key has unexpected size: " + bArrDecode.length + "}");
                                } else {
                                    Intrinsics.beachfront(bArrDecode);
                                    Intrinsics.beachfront(bArrDoFinal2);
                                    byte[] bArrGintrap3 = arytenoidectomy.gintrap(arytenoidectomy.gintrap(bArrDecode, bArrDoFinal2), bArrGintrap2);
                                    Intrinsics.beachfront(secretKeyGenerateKey2);
                                    on0Var = new tn0(Base64.encodeToString(arytenoidectomy.gintrap(bArrGintrap3, gaucho.attabal(secretKeyGenerateKey2, bArrGintrap2)), 11));
                                    rn0Var = on0Var;
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                on0Var = new on0(e, null, null, 6);
            }
            if (rn0Var instanceof nn0) {
                y13.a((nn0) rn0Var, false);
            }
            interaction.saneness.attabal(w03VarA, null);
            return rn0Var;
        } catch (Throwable th) {
            try {
                w03VarA.b(th);
                if (th instanceof evenfall) {
                    throw th;
                }
                w03VarA.a(th);
                if (th instanceof TimeoutCancellationException) {
                    throw new cp0(th);
                }
                if (th instanceof CancellationException) {
                    throw new bn0(th);
                }
                if (th instanceof yn0) {
                    throw th;
                }
                throw new gn0(th);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    interaction.saneness.attabal(w03VarA, th2);
                    throw th3;
                }
            }
        }
    }
}
