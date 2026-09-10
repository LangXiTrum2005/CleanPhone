package com.google.android.gms.internal.ads;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbdw {
    private final zzbdm zza;
    private final int zzb;
    private final int zzc;

    public zzbdw(int i2, int i3, int i4) {
        this.zzb = i2;
        i3 = (i3 > 64 || i3 < 0) ? 64 : i3;
        if (i4 <= 0) {
            this.zzc = 1;
        } else {
            this.zzc = i4;
        }
        this.zza = new zzbdu(i3);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new zzbdv(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((zzbdl) arrayList2.get(i2)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split(IOUtils.LINE_SEPARATOR_UNIX);
            if (strArrSplit.length != 0) {
                for (String str : strArrSplit) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i3 = 1;
                        boolean z2 = false;
                        while (true) {
                            int i4 = i3 + 2;
                            if (i4 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i3) == '\'') {
                                if (sb.charAt(i3 - 1) != ' ') {
                                    int i5 = i3 + 1;
                                    if ((sb.charAt(i5) == 's' || sb.charAt(i5) == 'S') && (i4 == sb.length() || sb.charAt(i4) == ' ')) {
                                        sb.insert(i3, ' ');
                                        i3 = i4;
                                    } else {
                                        sb.setCharAt(i3, ' ');
                                    }
                                } else {
                                    sb.setCharAt(i3, ' ');
                                }
                                z2 = true;
                            }
                            i3++;
                        }
                        String string = z2 ? sb.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    }
                    String[] strArrZzb = zzbdq.zzb(str, true);
                    int length = strArrZzb.length;
                    int i6 = this.zzc;
                    if (length >= i6) {
                        for (int i7 = 0; i7 < strArrZzb.length; i7++) {
                            String strConcat = "";
                            for (int i8 = 0; i8 < i6; i8++) {
                                int i9 = i7 + i8;
                                if (i9 >= strArrZzb.length) {
                                    break;
                                }
                                if (i8 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrZzb[i9]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
            }
        }
        zzbdo zzbdoVar = new zzbdo();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzbdoVar.zzb.write(this.zza.zza((String) it.next()));
            } catch (IOException e2) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e2);
            }
        }
        return zzbdoVar.toString();
    }
}
