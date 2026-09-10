package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements Iterable, b6, x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeMap f23720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeMap f23721b;

    public m1() {
        this.f23720a = new TreeMap();
        this.f23721b = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.x5
    public final void b(String str, b6 b6Var) {
        TreeMap treeMap = this.f23721b;
        if (b6Var == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, b6Var);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (q() != m1Var.q()) {
            return false;
        }
        TreeMap treeMap = this.f23720a;
        if (treeMap.isEmpty()) {
            return m1Var.f23720a.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!r(iIntValue).equals(m1Var.r(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f23720a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d6(this, 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0209  */
    /* JADX WARN: Code duplicated, block: B:103:0x0213  */
    /* JADX WARN: Code duplicated, block: B:105:0x0218  */
    /* JADX WARN: Code duplicated, block: B:107:0x023c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0244  */
    /* JADX WARN: Code duplicated, block: B:111:0x024f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0270  */
    /* JADX WARN: Code duplicated, block: B:114:0x0276  */
    /* JADX WARN: Code duplicated, block: B:118:0x0285 A[LOOP:2: B:116:0x0280->B:118:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x0294  */
    /* JADX WARN: Code duplicated, block: B:122:0x029a  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:131:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:143:0x0302  */
    /* JADX WARN: Code duplicated, block: B:145:0x030c  */
    /* JADX WARN: Code duplicated, block: B:147:0x031f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0323  */
    /* JADX WARN: Code duplicated, block: B:153:0x0343 A[LOOP:3: B:151:0x033d->B:153:0x0343, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x0351  */
    /* JADX WARN: Code duplicated, block: B:157:0x0359  */
    /* JADX WARN: Code duplicated, block: B:159:0x0370  */
    /* JADX WARN: Code duplicated, block: B:162:0x0377  */
    /* JADX WARN: Code duplicated, block: B:165:0x0383  */
    /* JADX WARN: Code duplicated, block: B:173:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:177:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:179:0x03da  */
    /* JADX WARN: Code duplicated, block: B:182:0x03e4 A[LOOP:5: B:180:0x03de->B:182:0x03e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x0409  */
    /* JADX WARN: Code duplicated, block: B:187:0x0411  */
    /* JADX WARN: Code duplicated, block: B:189:0x041b  */
    /* JADX WARN: Code duplicated, block: B:191:0x041e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0424  */
    /* JADX WARN: Code duplicated, block: B:199:0x0441  */
    /* JADX WARN: Code duplicated, block: B:200:0x0444  */
    /* JADX WARN: Code duplicated, block: B:203:0x0450  */
    /* JADX WARN: Code duplicated, block: B:205:0x0458  */
    /* JADX WARN: Code duplicated, block: B:208:0x0464  */
    /* JADX WARN: Code duplicated, block: B:210:0x046e  */
    /* JADX WARN: Code duplicated, block: B:212:0x0478  */
    /* JADX WARN: Code duplicated, block: B:214:0x048f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0495  */
    /* JADX WARN: Code duplicated, block: B:218:0x049b  */
    /* JADX WARN: Code duplicated, block: B:220:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:222:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:224:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:226:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:229:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:231:0x04d7 A[LOOP:6: B:227:0x04bf->B:231:0x04d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:237:0x04f5 A[LOOP:7: B:235:0x04ef->B:237:0x04f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:241:0x0519 A[LOOP:8: B:239:0x0513->B:241:0x0519, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:244:0x053e  */
    /* JADX WARN: Code duplicated, block: B:246:0x0546  */
    /* JADX WARN: Code duplicated, block: B:248:0x0550  */
    /* JADX WARN: Code duplicated, block: B:251:0x056e  */
    /* JADX WARN: Code duplicated, block: B:253:0x058a  */
    /* JADX WARN: Code duplicated, block: B:255:0x0594  */
    /* JADX WARN: Code duplicated, block: B:258:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:259:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:262:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:264:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:266:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:275:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:277:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:279:0x060a  */
    /* JADX WARN: Code duplicated, block: B:282:0x0611  */
    /* JADX WARN: Code duplicated, block: B:284:0x0617  */
    /* JADX WARN: Code duplicated, block: B:286:0x061d  */
    /* JADX WARN: Code duplicated, block: B:288:0x0625  */
    /* JADX WARN: Code duplicated, block: B:290:0x062b  */
    /* JADX WARN: Code duplicated, block: B:292:0x0631  */
    /* JADX WARN: Code duplicated, block: B:294:0x0653  */
    /* JADX WARN: Code duplicated, block: B:295:0x065f  */
    /* JADX WARN: Code duplicated, block: B:297:0x0665  */
    /* JADX WARN: Code duplicated, block: B:300:0x0679  */
    /* JADX WARN: Code duplicated, block: B:302:0x0697  */
    /* JADX WARN: Code duplicated, block: B:305:0x06a0 A[LOOP:10: B:303:0x0698->B:305:0x06a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:308:0x06b8 A[LOOP:11: B:308:0x06b8->B:324:0x070a, LOOP_START, PHI: r6 r32
  0x06b8: PHI (r6v10 int) = (r6v9 int), (r6v11 int) binds: [B:307:0x06b6, B:324:0x070a] A[DONT_GENERATE, DONT_INLINE]
  0x06b8: PHI (r32v1 java.util.TreeMap) = (r32v0 java.util.TreeMap), (r32v4 java.util.TreeMap) binds: [B:307:0x06b6, B:324:0x070a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:310:0x06be  */
    /* JADX WARN: Code duplicated, block: B:312:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:314:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:316:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:317:0x06de  */
    /* JADX WARN: Code duplicated, block: B:319:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:321:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:329:0x0732 A[ADDED_TO_REGION, LOOP:13: B:329:0x0732->B:330:0x0734, LOOP_START, PHI: r0
  0x0732: PHI (r0v34 int) = (r0v33 int), (r0v35 int) binds: [B:299:0x0677, B:330:0x0734] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:330:0x0734 A[LOOP:13: B:329:0x0732->B:330:0x0734, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:332:0x0746  */
    /* JADX WARN: Code duplicated, block: B:334:0x074e  */
    /* JADX WARN: Code duplicated, block: B:336:0x0754  */
    /* JADX WARN: Code duplicated, block: B:338:0x0761  */
    /* JADX WARN: Code duplicated, block: B:340:0x0777  */
    /* JADX WARN: Code duplicated, block: B:342:0x077d  */
    /* JADX WARN: Code duplicated, block: B:344:0x0783  */
    /* JADX WARN: Code duplicated, block: B:347:0x07a0 A[LOOP:14: B:345:0x079a->B:347:0x07a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:349:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:351:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:353:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:355:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:358:0x07db  */
    /* JADX WARN: Code duplicated, block: B:360:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:365:0x0801 A[LOOP:16: B:363:0x07fb->B:365:0x0801, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:370:0x0825  */
    /* JADX WARN: Code duplicated, block: B:372:0x082d  */
    /* JADX WARN: Code duplicated, block: B:374:0x083d  */
    /* JADX WARN: Code duplicated, block: B:384:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x04df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x072a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x070f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x0700 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x081c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x0818 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x07f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x012b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0131  */
    /* JADX WARN: Code duplicated, block: B:58:0x013b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0153  */
    /* JADX WARN: Code duplicated, block: B:63:0x0176  */
    /* JADX WARN: Code duplicated, block: B:65:0x017c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    /* JADX WARN: Code duplicated, block: B:68:0x0188  */
    /* JADX WARN: Code duplicated, block: B:69:0x018a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0196  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01da  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:99:0x0203  */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e5, code lost:
    
        if (com.google.android.gms.internal.measurement.gb.e(r7, r2, (com.google.android.gms.internal.measurement.a6) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).q() != r7.q()) goto L171;
     */
    @Override // com.google.android.gms.internal.measurement.b6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.b6 m(java.lang.String r38, com.google.android.gms.internal.measurement.d8 r39, java.util.ArrayList r40) {
        /*
            Method dump skipped, instruction units count: 2200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.m1.m(java.lang.String, com.google.android.gms.internal.measurement.d8, java.util.ArrayList):com.google.android.gms.internal.measurement.b6");
    }

    public final List n() {
        ArrayList arrayList = new ArrayList(q());
        for (int i10 = 0; i10 < q(); i10++) {
            arrayList.add(r(i10));
        }
        return arrayList;
    }

    public final Iterator p() {
        return this.f23720a.keySet().iterator();
    }

    public final int q() {
        TreeMap treeMap = this.f23720a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final b6 r(int i10) {
        b6 b6Var;
        if (i10 < q()) {
            return (!t(i10) || (b6Var = (b6) this.f23720a.get(Integer.valueOf(i10))) == null) ? b6.S8 : b6Var;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void s(int i10, b6 b6Var) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 21), "Out of bounds index: ", i10));
        }
        TreeMap treeMap = this.f23720a;
        if (b6Var == null) {
            treeMap.remove(Integer.valueOf(i10));
        } else {
            treeMap.put(Integer.valueOf(i10), b6Var);
        }
    }

    public final boolean t(int i10) {
        if (i10 >= 0) {
            TreeMap treeMap = this.f23720a;
            if (i10 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i10));
            }
        }
        throw new IndexOutOfBoundsException(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 21), "Out of bounds index: ", i10));
    }

    public final String toString() {
        return v(",");
    }

    public final void u(int i10) {
        TreeMap treeMap = this.f23720a;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i10 > iIntValue || i10 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i10));
        if (i10 == iIntValue) {
            int i11 = i10 - 1;
            Integer numValueOf = Integer.valueOf(i11);
            if (treeMap.containsKey(numValueOf) || i11 < 0) {
                return;
            }
            treeMap.put(numValueOf, b6.S8);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i10);
            b6 b6Var = (b6) treeMap.get(numValueOf2);
            if (b6Var != null) {
                treeMap.put(Integer.valueOf(i10 - 1), b6Var);
                treeMap.remove(numValueOf2);
            }
        }
    }

    public final String v(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f23720a.isEmpty()) {
            int i10 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i10 >= q()) {
                    break;
                }
                b6 b6VarR = r(i10);
                sb2.append(str2);
                if (!(b6VarR instanceof f6) && !(b6VarR instanceof z5)) {
                    sb2.append(b6VarR.zzc());
                }
                i10++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final String zzc() {
        return v(",");
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Double zzd() {
        TreeMap treeMap = this.f23720a;
        if (treeMap.size() == 1) {
            return r(0).zzd();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Iterator zzf() {
        return new k0(this, this.f23720a.keySet().iterator(), this.f23721b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.x5
    public final boolean zzj(String str) {
        return "length".equals(str) || this.f23721b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.x5
    public final b6 zzk(String str) {
        b6 b6Var;
        if ("length".equals(str)) {
            return new o3(Double.valueOf(q()));
        }
        return (!zzj(str) || (b6Var = (b6) this.f23721b.get(str)) == null) ? b6.S8 : b6Var;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final b6 zzt() {
        m1 m1Var = new m1();
        for (Map.Entry entry : this.f23720a.entrySet()) {
            boolean z10 = entry.getValue() instanceof x5;
            TreeMap treeMap = m1Var.f23720a;
            if (z10) {
                treeMap.put((Integer) entry.getKey(), (b6) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((b6) entry.getValue()).zzt());
            }
        }
        return m1Var;
    }

    public m1(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                s(i10, (b6) list.get(i10));
            }
        }
    }
}
