package com.bytedance.adsdk.ri.lr.fi;

import com.bytedance.adsdk.ri.lr.ka.ik;
import com.bytedance.adsdk.ri.lr.ka.ka;
import com.bytedance.adsdk.ri.lr.lr.ri.aw;
import com.bytedance.adsdk.ri.lr.lr.ri.bgr;
import com.bytedance.adsdk.ri.lr.lr.ri.bu;
import com.bytedance.adsdk.ri.lr.lr.ri.co;
import com.bytedance.adsdk.ri.lr.lr.ri.di;
import com.bytedance.adsdk.ri.lr.lr.ri.fi;
import com.bytedance.adsdk.ri.lr.lr.ri.jbs;
import com.bytedance.adsdk.ri.lr.lr.ri.mj;
import com.bytedance.adsdk.ri.lr.lr.ri.nr;
import com.bytedance.adsdk.ri.lr.lr.ri.sf;
import com.bytedance.adsdk.ri.lr.lr.ri.tan;
import com.unity3d.services.UnityAdsConstants;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lr {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.fi.lr$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ri;

        static {
            int[] iArr = new int[ik.values().length];
            ri = iArr;
            try {
                iArr[ik.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ri[ik.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ri[ik.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ri[ik.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ri[ik.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ri[ik.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ri[ik.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ri[ik.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ri[ik.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ri[ik.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ri[ik.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                ri[ik.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                ri[ik.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static void ik(List<com.bytedance.adsdk.ri.lr.lr.ri> list, String str, int i) {
        Iterator<com.bytedance.adsdk.ri.lr.lr.ri> it = list.iterator();
        while (it.hasNext()) {
            if (ka.ri(it.next().ri())) {
                throw new IllegalArgumentException(str.substring(0, i));
            }
        }
    }

    private static Deque<com.bytedance.adsdk.ri.lr.lr.ri> lr(List<com.bytedance.adsdk.ri.lr.lr.ri> list, String str, int i) {
        LinkedList<com.bytedance.adsdk.ri.lr.lr.ri> linkedList = new LinkedList(list);
        int i2 = 5;
        while (i2 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.ri.lr.lr.ri riVar : linkedList) {
                if (!linkedList2.isEmpty() && ik.ri(((com.bytedance.adsdk.ri.lr.lr.ri) linkedList2.peekLast()).ri()) && ((ik) ((com.bytedance.adsdk.ri.lr.lr.ri) linkedList2.peekLast()).ri()).lr() == i2) {
                    com.bytedance.adsdk.ri.lr.lr.ri riVar2 = (com.bytedance.adsdk.ri.lr.lr.ri) linkedList2.pollLast();
                    com.bytedance.adsdk.ri.lr.lr.ri riVar3 = (com.bytedance.adsdk.ri.lr.lr.ri) linkedList2.pollLast();
                    if (ik.ri(riVar3.ri()) || ik.ri(riVar.ri())) {
                        throw new IllegalArgumentException(str.substring(0, i));
                    }
                    linkedList2.addLast(ri(riVar3, riVar2, riVar));
                } else {
                    linkedList2.addLast(riVar);
                }
            }
            i2--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    public static com.bytedance.adsdk.ri.lr.lr.ri ri(List<com.bytedance.adsdk.ri.lr.lr.ri> list, String str, int i) {
        ik(list, str, i);
        Deque<com.bytedance.adsdk.ri.lr.lr.ri> dequeRi = ri(lr(list, str, i));
        if (dequeRi.size() == 1) {
            return dequeRi.getFirst();
        }
        throw new IllegalStateException();
    }

    private static Deque<com.bytedance.adsdk.ri.lr.lr.ri> ri(Deque<com.bytedance.adsdk.ri.lr.lr.ri> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.ri.lr.lr.ri riVar : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.ri.lr.lr.ri) linkedList.peekLast()).ri() == ik.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.ri.lr.lr.ri riVar2 = (com.bytedance.adsdk.ri.lr.lr.ri) linkedList.pollLast();
                if (((com.bytedance.adsdk.ri.lr.lr.ri) linkedList.pollLast()).ri() == ik.QUESTION) {
                    com.bytedance.adsdk.ri.lr.lr.ri riVar3 = (com.bytedance.adsdk.ri.lr.lr.ri) linkedList.pollLast();
                    tan tanVar = new tan();
                    tanVar.ri(riVar3);
                    tanVar.lr(riVar2);
                    tanVar.ik(riVar);
                    linkedList.addLast(tanVar);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                linkedList.addLast(riVar);
            }
        }
        return linkedList;
    }

    private static com.bytedance.adsdk.ri.lr.lr.ri ri(com.bytedance.adsdk.ri.lr.lr.ri riVar, com.bytedance.adsdk.ri.lr.lr.ri riVar2, com.bytedance.adsdk.ri.lr.lr.ri riVar3) {
        bu sfVar;
        switch (AnonymousClass1.ri[((ik) riVar2.ri()).ordinal()]) {
            case 1:
                sfVar = new sf();
                break;
            case 2:
                sfVar = new nr();
                break;
            case 3:
                sfVar = new com.bytedance.adsdk.ri.lr.lr.ri.ri();
                break;
            case 4:
                sfVar = new aw();
                break;
            case 5:
                sfVar = new co();
                break;
            case 6:
                sfVar = new com.bytedance.adsdk.ri.lr.lr.ri.ka();
                break;
            case 7:
                sfVar = new bgr();
                break;
            case 8:
                sfVar = new di();
                break;
            case 9:
                sfVar = new jbs();
                break;
            case 10:
                sfVar = new fi();
                break;
            case 11:
                sfVar = new mj();
                break;
            case 12:
                sfVar = new com.bytedance.adsdk.ri.lr.lr.ri.lr();
                break;
            case 13:
                sfVar = new com.bytedance.adsdk.ri.lr.lr.ri.ik();
                break;
            default:
                throw new UnsupportedOperationException(riVar2.ri().toString());
        }
        sfVar.ri(riVar);
        sfVar.lr(riVar3);
        return sfVar;
    }

    public static boolean ri(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return false;
    }
}
