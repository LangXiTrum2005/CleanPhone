package babyless;

import android.text.TextUtils;
import com.ironsource.X3;

/* JADX INFO: compiled from: CipherCache.java */
/* JADX INFO: loaded from: classes3.dex */
public class wireman implements babyless.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public saneness f14834attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public manyplies.attabal f14835dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public dishoard.saneness f14836saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public ahermatype.saneness f14837wireman;

    /* JADX INFO: compiled from: CipherCache.java */
    public class attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ boolean f14838arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Object f14839kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ String f14840monoploid;

        public attabal(Object obj, dialectally.attabal attabalVar, boolean z, String str) {
            this.f14839kowloon = obj;
            this.f14838arytenoidectomy = z;
            this.f14840monoploid = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strSaneness = wireman.this.f14836saneness.saneness(this.f14839kowloon);
            if (TextUtils.isEmpty(strSaneness)) {
                return;
            }
            if (this.f14838arytenoidectomy) {
                if (wireman.this.f14837wireman == null) {
                    return;
                }
                try {
                    strSaneness = wireman.this.f14837wireman.dern(this.f14840monoploid, strSaneness);
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            String strAttabal = wireman.this.f14835dern.attabal(this.f14838arytenoidectomy, strSaneness, this.f14839kowloon);
            if (TextUtils.isEmpty(strAttabal)) {
                return;
            }
            if (this.f14840monoploid.startsWith(X3.i.b)) {
                dibatag.attabal.impromptu(this.f14840monoploid, strAttabal);
            } else if (this.f14840monoploid.startsWith("sp")) {
                dibatag.saneness.beachfront(wireman.this.f14834attabal.attabal(), this.f14840monoploid, strAttabal);
            }
        }
    }

    public wireman(saneness sanenessVar) {
        this.f14834attabal = sanenessVar;
        this.f14836saneness = sanenessVar.dern();
        this.f14835dern = this.f14834attabal.wireman();
        this.f14837wireman = this.f14834attabal.saneness();
    }

    @Override // babyless.attabal
    public boolean attabal(String str) {
        if (str.startsWith(X3.i.b)) {
            return dibatag.attabal.attabal(str);
        }
        if (str.startsWith("sp")) {
            return dibatag.saneness.attabal(this.f14834attabal.attabal(), str);
        }
        return false;
    }

    @Override // babyless.attabal
    public <T> void dern(String str, T t, boolean z, dialectally.attabal<Boolean> attabalVar) {
        if (TextUtils.isEmpty(str) || !(str.startsWith(X3.i.b) || str.startsWith("sp"))) {
            throw new IllegalArgumentException("key cannot be empty, and must start with \"sp\" or \"file\". Please check the notes in YoloCacheConstants.java");
        }
        provostship.attabal.attabal().saneness().execute(new attabal(t, attabalVar, z, str));
    }

    @Override // babyless.attabal
    public <T> T marial(String str, Class cls) {
        String strSaneness;
        marial marialVarSaneness;
        String strSaneness2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(X3.i.b)) {
            strSaneness = dibatag.attabal.saneness(str);
        } else {
            strSaneness = str.startsWith("sp") ? (String) dibatag.saneness.saneness(this.f14834attabal.attabal(), str) : null;
        }
        if (TextUtils.isEmpty(strSaneness) || (marialVarSaneness = this.f14835dern.saneness(strSaneness)) == null) {
            return null;
        }
        if (marialVarSaneness.f14827marial) {
            ahermatype.saneness sanenessVar = this.f14837wireman;
            if (sanenessVar == null) {
                return null;
            }
            try {
                strSaneness2 = sanenessVar.saneness(str, marialVarSaneness.f14828saneness);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            strSaneness2 = marialVarSaneness.f14828saneness;
        }
        try {
            return (T) this.f14836saneness.attabal(strSaneness2, marialVarSaneness, cls);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // babyless.attabal
    public <T> T saneness(String str, T t, Class cls) {
        T t2 = (T) marial(str, cls);
        return t2 == null ? t : t2;
    }

    @Override // babyless.attabal
    public <T> boolean wireman(String str, T t, boolean z) {
        if (TextUtils.isEmpty(str) || !(str.startsWith(X3.i.b) || str.startsWith("sp"))) {
            throw new IllegalArgumentException("key cannot be empty, and must start with \"sp\" or \"file\". Please check the notes in YoloCacheConstants.java");
        }
        String strSaneness = this.f14836saneness.saneness(t);
        if (TextUtils.isEmpty(strSaneness)) {
            return false;
        }
        if (z) {
            ahermatype.saneness sanenessVar = this.f14837wireman;
            if (sanenessVar == null) {
                return false;
            }
            try {
                strSaneness = sanenessVar.dern(str, strSaneness);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        String strAttabal = this.f14835dern.attabal(z, strSaneness, t);
        if (TextUtils.isEmpty(strAttabal)) {
            return false;
        }
        if (str.startsWith(X3.i.b)) {
            return dibatag.attabal.impromptu(str, strAttabal);
        }
        if (str.startsWith("sp")) {
            return dibatag.saneness.beachfront(this.f14834attabal.attabal(), str, strAttabal);
        }
        return false;
    }
}
