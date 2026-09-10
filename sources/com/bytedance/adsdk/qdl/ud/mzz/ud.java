package com.bytedance.adsdk.qdl.ud.mzz;

import com.bytedance.adsdk.qdl.ud.mml.lnr;
import com.bytedance.adsdk.qdl.ud.mml.mml;
import com.bytedance.adsdk.qdl.ud.ud.qdl.exc;
import com.bytedance.adsdk.qdl.ud.ud.qdl.exu;
import com.bytedance.adsdk.qdl.ud.ud.qdl.fs;
import com.bytedance.adsdk.qdl.ud.ud.qdl.jl;
import com.bytedance.adsdk.qdl.ud.ud.qdl.jpc;
import com.bytedance.adsdk.qdl.ud.ud.qdl.mo;
import com.bytedance.adsdk.qdl.ud.ud.qdl.mzz;
import com.bytedance.adsdk.qdl.ud.ud.qdl.rdp;
import com.bytedance.adsdk.qdl.ud.ud.qdl.rq;
import com.bytedance.adsdk.qdl.ud.ud.qdl.tvp;
import com.bytedance.adsdk.qdl.ud.ud.qdl.yt;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ud {

    /* JADX INFO: renamed from: com.bytedance.adsdk.qdl.ud.mzz.ud$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[lnr.values().length];
            qdl = iArr;
            try {
                iArr[lnr.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[lnr.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[lnr.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                qdl[lnr.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                qdl[lnr.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                qdl[lnr.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                qdl[lnr.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                qdl[lnr.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                qdl[lnr.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                qdl[lnr.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                qdl[lnr.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                qdl[lnr.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                qdl[lnr.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static void lnr(List<com.bytedance.adsdk.qdl.ud.ud.qdl> list, String str, int i2) {
        Iterator<com.bytedance.adsdk.qdl.ud.ud.qdl> it = list.iterator();
        while (it.hasNext()) {
            if (mml.qdl(it.next().qdl())) {
                throw new IllegalArgumentException(str.substring(0, i2));
            }
        }
    }

    public static com.bytedance.adsdk.qdl.ud.ud.qdl qdl(List<com.bytedance.adsdk.qdl.ud.ud.qdl> list, String str, int i2) {
        lnr(list, str, i2);
        Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> dequeQdl = qdl(ud(list, str, i2));
        if (dequeQdl.size() == 1) {
            return dequeQdl.getFirst();
        }
        throw new IllegalStateException();
    }

    private static Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> ud(List<com.bytedance.adsdk.qdl.ud.ud.qdl> list, String str, int i2) {
        LinkedList<com.bytedance.adsdk.qdl.ud.ud.qdl> linkedList = new LinkedList(list);
        int i3 = 5;
        while (i3 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar : linkedList) {
                if (!linkedList2.isEmpty() && lnr.qdl(((com.bytedance.adsdk.qdl.ud.ud.qdl) linkedList2.peekLast()).qdl()) && ((lnr) ((com.bytedance.adsdk.qdl.ud.ud.qdl) linkedList2.peekLast()).qdl()).ud() == i3) {
                    com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar2 = (com.bytedance.adsdk.qdl.ud.ud.qdl) linkedList2.pollLast();
                    com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar3 = (com.bytedance.adsdk.qdl.ud.ud.qdl) linkedList2.pollLast();
                    if (lnr.qdl(qdlVar3.qdl()) || lnr.qdl(qdlVar.qdl())) {
                        throw new IllegalArgumentException(str.substring(0, i2));
                    }
                    linkedList2.addLast(qdl(qdlVar3, qdlVar2, qdlVar));
                } else {
                    linkedList2.addLast(qdlVar);
                }
            }
            i3--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    private static Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> qdl(Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.qdl.ud.ud.qdl) linkedList.peekLast()).qdl() == lnr.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar2 = (com.bytedance.adsdk.qdl.ud.ud.qdl) linkedList.pollLast();
                if (((com.bytedance.adsdk.qdl.ud.ud.qdl) linkedList.pollLast()).qdl() == lnr.QUESTION) {
                    com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar3 = (com.bytedance.adsdk.qdl.ud.ud.qdl) linkedList.pollLast();
                    exc excVar = new exc();
                    excVar.qdl(qdlVar3);
                    excVar.ud(qdlVar2);
                    excVar.lnr(qdlVar);
                    linkedList.addLast(excVar);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                linkedList.addLast(qdlVar);
            }
        }
        return linkedList;
    }

    private static com.bytedance.adsdk.qdl.ud.ud.qdl qdl(com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar, com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar2, com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar3) {
        yt rqVar;
        switch (AnonymousClass1.qdl[((lnr) qdlVar2.qdl()).ordinal()]) {
            case 1:
                rqVar = new rq();
                break;
            case 2:
                rqVar = new jl();
                break;
            case 3:
                rqVar = new com.bytedance.adsdk.qdl.ud.ud.qdl.qdl();
                break;
            case 4:
                rqVar = new exu();
                break;
            case 5:
                rqVar = new fs();
                break;
            case 6:
                rqVar = new com.bytedance.adsdk.qdl.ud.ud.qdl.mml();
                break;
            case 7:
                rqVar = new rdp();
                break;
            case 8:
                rqVar = new mo();
                break;
            case 9:
                rqVar = new tvp();
                break;
            case 10:
                rqVar = new mzz();
                break;
            case 11:
                rqVar = new jpc();
                break;
            case 12:
                rqVar = new com.bytedance.adsdk.qdl.ud.ud.qdl.ud();
                break;
            case 13:
                rqVar = new com.bytedance.adsdk.qdl.ud.ud.qdl.lnr();
                break;
            default:
                throw new UnsupportedOperationException(qdlVar2.qdl().toString());
        }
        rqVar.qdl(qdlVar);
        rqVar.ud(qdlVar3);
        return rqVar;
    }

    public static boolean qdl(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
