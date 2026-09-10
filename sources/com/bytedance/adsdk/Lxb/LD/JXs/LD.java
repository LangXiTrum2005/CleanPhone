package com.bytedance.adsdk.Lxb.LD.JXs;

import com.bytedance.adsdk.Lxb.LD.LD.Lxb.JVA;
import com.bytedance.adsdk.Lxb.LD.LD.Lxb.JXs;
import com.bytedance.adsdk.Lxb.LD.LD.Lxb.NXR;
import com.bytedance.adsdk.Lxb.LD.LD.Lxb.OY;
import com.bytedance.adsdk.Lxb.LD.LD.Lxb.QAg;
import com.bytedance.adsdk.Lxb.LD.LD.Lxb.STP;
import com.bytedance.adsdk.Lxb.LD.LD.Lxb.brP;
import com.bytedance.adsdk.Lxb.LD.LD.Lxb.kqm;
import com.bytedance.adsdk.Lxb.LD.LD.Lxb.lc;
import com.bytedance.adsdk.Lxb.LD.LD.Lxb.sLN;
import com.bytedance.adsdk.Lxb.LD.LD.Lxb.tD;
import com.bytedance.adsdk.Lxb.LD.ZU.ZU;
import com.bytedance.adsdk.Lxb.LD.ZU.lk;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LD {

    /* JADX INFO: renamed from: com.bytedance.adsdk.Lxb.LD.JXs.LD$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Lxb;

        static {
            int[] iArr = new int[lk.values().length];
            Lxb = iArr;
            try {
                iArr[lk.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Lxb[lk.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Lxb[lk.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Lxb[lk.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Lxb[lk.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Lxb[lk.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Lxb[lk.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Lxb[lk.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Lxb[lk.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Lxb[lk.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Lxb[lk.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                Lxb[lk.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                Lxb[lk.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> LD(List<com.bytedance.adsdk.Lxb.LD.LD.Lxb> list, String str, int i) {
        LinkedList<com.bytedance.adsdk.Lxb.LD.LD.Lxb> linkedList = new LinkedList(list);
        int i2 = 5;
        while (i2 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.Lxb.LD.LD.Lxb lxb : linkedList) {
                if (!linkedList2.isEmpty() && lk.Lxb(((com.bytedance.adsdk.Lxb.LD.LD.Lxb) linkedList2.peekLast()).Lxb()) && ((lk) ((com.bytedance.adsdk.Lxb.LD.LD.Lxb) linkedList2.peekLast()).Lxb()).LD() == i2) {
                    com.bytedance.adsdk.Lxb.LD.LD.Lxb lxb2 = (com.bytedance.adsdk.Lxb.LD.LD.Lxb) linkedList2.pollLast();
                    com.bytedance.adsdk.Lxb.LD.LD.Lxb lxb3 = (com.bytedance.adsdk.Lxb.LD.LD.Lxb) linkedList2.pollLast();
                    if (lk.Lxb(lxb3.Lxb()) || lk.Lxb(lxb.Lxb())) {
                        throw new IllegalArgumentException(str.substring(0, i));
                    }
                    linkedList2.addLast(Lxb(lxb3, lxb2, lxb));
                } else {
                    linkedList2.addLast(lxb);
                }
            }
            i2--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    public static com.bytedance.adsdk.Lxb.LD.LD.Lxb Lxb(List<com.bytedance.adsdk.Lxb.LD.LD.Lxb> list, String str, int i) {
        lk(list, str, i);
        Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> dequeLxb = Lxb(LD(list, str, i));
        if (dequeLxb.size() == 1) {
            return dequeLxb.getFirst();
        }
        throw new IllegalStateException();
    }

    private static void lk(List<com.bytedance.adsdk.Lxb.LD.LD.Lxb> list, String str, int i) {
        Iterator<com.bytedance.adsdk.Lxb.LD.LD.Lxb> it = list.iterator();
        while (it.hasNext()) {
            if (ZU.Lxb(it.next().Lxb())) {
                throw new IllegalArgumentException(str.substring(0, i));
            }
        }
    }

    private static Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> Lxb(Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.Lxb.LD.LD.Lxb lxb : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.Lxb.LD.LD.Lxb) linkedList.peekLast()).Lxb() == lk.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.Lxb.LD.LD.Lxb lxb2 = (com.bytedance.adsdk.Lxb.LD.LD.Lxb) linkedList.pollLast();
                if (((com.bytedance.adsdk.Lxb.LD.LD.Lxb) linkedList.pollLast()).Lxb() == lk.QUESTION) {
                    com.bytedance.adsdk.Lxb.LD.LD.Lxb lxb3 = (com.bytedance.adsdk.Lxb.LD.LD.Lxb) linkedList.pollLast();
                    tD tDVar = new tD();
                    tDVar.Lxb(lxb3);
                    tDVar.LD(lxb2);
                    tDVar.lk(lxb);
                    linkedList.addLast(tDVar);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                linkedList.addLast(lxb);
            }
        }
        return linkedList;
    }

    private static com.bytedance.adsdk.Lxb.LD.LD.Lxb Lxb(com.bytedance.adsdk.Lxb.LD.LD.Lxb lxb, com.bytedance.adsdk.Lxb.LD.LD.Lxb lxb2, com.bytedance.adsdk.Lxb.LD.LD.Lxb lxb3) {
        kqm jva;
        switch (AnonymousClass1.Lxb[((lk) lxb2.Lxb()).ordinal()]) {
            case 1:
                jva = new JVA();
                break;
            case 2:
                jva = new brP();
                break;
            case 3:
                jva = new com.bytedance.adsdk.Lxb.LD.LD.Lxb.Lxb();
                break;
            case 4:
                jva = new NXR();
                break;
            case 5:
                jva = new sLN();
                break;
            case 6:
                jva = new com.bytedance.adsdk.Lxb.LD.LD.Lxb.ZU();
                break;
            case 7:
                jva = new STP();
                break;
            case 8:
                jva = new lc();
                break;
            case 9:
                jva = new QAg();
                break;
            case 10:
                jva = new JXs();
                break;
            case 11:
                jva = new OY();
                break;
            case 12:
                jva = new com.bytedance.adsdk.Lxb.LD.LD.Lxb.LD();
                break;
            case 13:
                jva = new com.bytedance.adsdk.Lxb.LD.LD.Lxb.lk();
                break;
            default:
                throw new UnsupportedOperationException(lxb2.Lxb().toString());
        }
        jva.Lxb(lxb);
        jva.LD(lxb3);
        return jva;
    }

    public static boolean Lxb(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
