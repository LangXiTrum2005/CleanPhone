package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.42, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass42 {
    public static AnonymousClass42 A05;
    public static byte[] A06;
    public static final Object A07;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<AnonymousClass41>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<AnonymousClass41>> A03 = new HashMap<>();
    public final ArrayList<AnonymousClass40> A02 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{11, 11, 109, 66, 71, 95, 78, 89, 11, 79, 66, 79, 11, 69, 68, 95, 11, 70, 74, 95, 72, 67, 17, 11, 95, 95, 57, 22, 19, 11, 26, cw.k, 95, 18, 30, 11, 28, 23, 26, 27, 94, 95, 95, 18, 30, 11, 28, 23, 66, 79, 7, 42, 101, 108, 42, 99, 100, 126, 111, 100, 126, 42, 37, 118, 102, 109, 96, 104, 96, 37, 86, 116, 99, 126, 120, 121, 55, 123, 126, 100, 99, 45, 55, 84, 119, 123, 121, 116, 90, 106, 119, 121, 124, 123, 121, 107, 108, 85, 121, 118, 121, 127, 125, 106, 24, 52, 33, 54, 61, 60, 59, 50, 117, 52, 50, 52, 60, 59, 38, 33, 117, 51, 60, 57, 33, 48, 39, 117, 24, 47, 57, 37, 38, 60, 35, 36, 45, 106, 62, 51, 58, 47, 106, 56, 58, 45, 48, 54, 55, 78, 76, 89, 72, 74, 66, 95, 84, 12, 9, 28, 9, 72, 69, 76, 89, 91, 64, 69, 64, 65, 89, 64, cw.l, 92, 75, 79, 93, 65, 64};
    }

    static {
        A03();
        A07 = new Object();
    }

    public AnonymousClass42(Context context) {
        this.A00 = context;
        final Looper mainLooper = context.getMainLooper();
        this.A01 = new Handler(mainLooper) { // from class: com.facebook.ads.redexgen.X.3z
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        this.A00.A02();
                        break;
                    default:
                        super.handleMessage(message);
                        break;
                }
            }
        };
    }

    public static AnonymousClass42 A00(Context context) {
        AnonymousClass42 anonymousClass42;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new AnonymousClass42(context.getApplicationContext());
            }
            anonymousClass42 = A05;
        }
        return anonymousClass42;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        AnonymousClass40[] anonymousClass40Arr;
        while (true) {
            synchronized (this.A04) {
                int size = this.A02.size();
                if (size > 0) {
                    anonymousClass40Arr = new AnonymousClass40[size];
                    this.A02.toArray(anonymousClass40Arr);
                    this.A02.clear();
                } else {
                    return;
                }
            }
            for (AnonymousClass40 anonymousClass40 : anonymousClass40Arr) {
                int j = anonymousClass40.A01.size();
                for (int nbr = 0; nbr < j; nbr++) {
                    AnonymousClass41 anonymousClass41 = anonymousClass40.A01.get(nbr);
                    if (!anonymousClass41.A01) {
                        anonymousClass41.A02.onReceive(this.A00, anonymousClass40.A00);
                    }
                }
            }
        }
    }

    public final void A05(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<AnonymousClass41> arrayListRemove = this.A04.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                AnonymousClass41 anonymousClass41 = arrayListRemove.get(size);
                anonymousClass41.A01 = true;
                for (int j = 0; j < anonymousClass41.A03.countActions(); j++) {
                    String action = anonymousClass41.A03.getAction(j);
                    ArrayList<AnonymousClass41> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        int i = arrayList.size();
                        for (int i2 = i - 1; i2 >= 0; i2--) {
                            AnonymousClass41 anonymousClass42 = arrayList.get(i2);
                            if (anonymousClass42.A02 == broadcastReceiver) {
                                anonymousClass42.A01 = true;
                                arrayList.remove(i2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            AnonymousClass41 anonymousClass41 = new AnonymousClass41(intentFilter, broadcastReceiver);
            ArrayList<AnonymousClass41> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(anonymousClass41);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<AnonymousClass41> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(anonymousClass41);
            }
        }
    }

    public final boolean A07(Intent intent) {
        String strA01;
        synchronized (this.A04) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String action2 = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean debug = (intent.getFlags() & 8) != 0;
            if (debug) {
                StringBuilder sb = new StringBuilder();
                String type = A01(128, 15, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE);
                StringBuilder sbAppend = sb.append(type).append(strResolveTypeIfNeeded);
                String type2 = A01(62, 8, 58);
                StringBuilder sbAppend2 = sbAppend.append(type2).append(action2);
                String type3 = A01(51, 11, 53);
                sbAppend2.append(type3).append(intent).toString();
            }
            HashMap<String, ArrayList<AnonymousClass41>> map = this.A03;
            String type4 = intent.getAction();
            ArrayList<AnonymousClass41> arrayList = map.get(type4);
            if (arrayList != null) {
                if (debug) {
                    StringBuilder sb2 = new StringBuilder();
                    String type5 = A01(70, 13, 40);
                    sb2.append(type5).append(arrayList).toString();
                }
                ArrayList arrayList2 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    AnonymousClass41 anonymousClass41 = arrayList.get(i);
                    if (debug) {
                        StringBuilder sb3 = new StringBuilder();
                        String type6 = A01(104, 24, 106);
                        sb3.append(type6).append(anonymousClass41.A03).toString();
                    }
                    if (!anonymousClass41.A00) {
                        int iMatch = anonymousClass41.A03.match(action, strResolveTypeIfNeeded, action2, data, categories, A01(83, 21, 39));
                        if (iMatch >= 0) {
                            if (debug) {
                                String str = A01(24, 27, 64) + Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(anonymousClass41);
                            anonymousClass41.A00 = true;
                        } else if (debug) {
                            switch (iMatch) {
                                case -4:
                                    strA01 = A01(Input.Keys.NUMPAD_5, 8, 18);
                                    break;
                                case -3:
                                    strA01 = A01(Input.Keys.NUM_LOCK, 6, 102);
                                    break;
                                case -2:
                                    strA01 = A01(Input.Keys.NUMPAD_ADD, 4, 87);
                                    break;
                                case -1:
                                    strA01 = A01(Input.Keys.NUMPAD_EQUALS, 4, 3);
                                    break;
                                default:
                                    strA01 = A01(165, 14, 17);
                                    break;
                            }
                            String str2 = A01(0, 24, 20) + strA01;
                        }
                    }
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((AnonymousClass41) arrayList2.get(i2)).A00 = false;
                    }
                    this.A02.add(new AnonymousClass40(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
