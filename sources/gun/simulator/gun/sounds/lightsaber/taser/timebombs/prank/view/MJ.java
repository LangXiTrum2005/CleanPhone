package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MJ {
    public Map c;
    public Map d;
    public float e;
    public Map f;
    public List g;
    public SparseArrayCompat h;
    public LongSparseArray i;
    public List j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public boolean o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3170cU f3401a = new C3170cU();
    public final HashSet b = new HashSet();
    public int p = 0;

    public final void a(String str) {
        AbstractC5005xJ.b(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.l) / this.n) * 1000.0f);
    }

    public final Map c() {
        float fC = AbstractC3014ah0.c();
        if (fC != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                Map map = this.d;
                String str = (String) entry.getKey();
                C3425fK c3425fK = (C3425fK) entry.getValue();
                float f = this.e / fC;
                int i = (int) (c3425fK.f4364a * f);
                int i2 = (int) (c3425fK.b * f);
                C3425fK c3425fK2 = new C3425fK(i, i2, c3425fK.c, c3425fK.d, c3425fK.e);
                Bitmap bitmap = c3425fK.f;
                if (bitmap != null) {
                    c3425fK2.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(str, c3425fK2);
            }
        }
        this.e = fC;
        return this.d;
    }

    public final C4393qM d(String str) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            C4393qM c4393qM = (C4393qM) this.g.get(i);
            String str2 = c4393qM.f4879a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return c4393qM;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(((ZG) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
