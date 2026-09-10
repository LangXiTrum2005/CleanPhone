package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzrb;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class zzit implements Callable {
    final /* synthetic */ zzbg zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjd zzc;

    public zzit(zzjd zzjdVar, zzbg zzbgVar, String str) {
        this.zza = zzbgVar;
        this.zzb = str;
        Objects.requireNonNull(zzjdVar);
        this.zzc = zzjdVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x044a A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0460 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x046b A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x046f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0471 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0487 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x03f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x03e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01bc A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01f5 A[Catch: all -> 0x007b, SecurityException -> 0x0213, TryCatch #0 {SecurityException -> 0x0213, blocks: (B:60:0x01ed, B:62:0x01f5, B:64:0x01fb), top: B:128:0x01ed, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0220 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0245 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x025e A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0262 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0290 A[Catch: all -> 0x007b, LOOP:1: B:85:0x028a->B:87:0x0290, LOOP_END, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x032b A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x034c A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x038a A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x03e8 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        zzpg zzpgVar;
        String strZzc;
        zzpg zzpgVar2;
        List listZzn;
        Iterator it;
        zzpn zzpnVar;
        com.google.android.gms.internal.measurement.zziu[] zziuVarArr;
        int i2;
        zzpg zzpgVar3;
        zzic zzicVar;
        Bundle bundle;
        String str;
        String str2;
        zzbc zzbcVarZzf;
        zzpg zzpgVar4;
        Bundle bundle2;
        String str3;
        Object obj;
        boolean z2;
        com.google.android.gms.internal.measurement.zzhz zzhzVar;
        zzbc zzbcVarZza;
        long j;
        com.google.android.gms.internal.measurement.zzhr zzhrVarZzk;
        zzbe zzbeVar;
        zzbd zzbdVar;
        long jZzp;
        long jZzn;
        String strZzh;
        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn;
        Object objZza;
        byte[] bArr2;
        zzjd zzjdVar = this.zzc;
        zzjdVar.zzL().zzZ();
        zzlp zzlpVarZzn = zzjdVar.zzL().zzn();
        zzlpVarZzn.zzg();
        zzic zzicVar2 = zzlpVarZzn.zzu;
        zzic.zzL();
        zzbg zzbgVar = this.zza;
        Preconditions.checkNotNull(zzbgVar);
        String str4 = this.zzb;
        Preconditions.checkNotEmpty(str4);
        String str5 = zzbgVar.zza;
        if (!"_iap".equals(str5) && !"_iapx".equals(str5)) {
            zzlpVarZzn.zzu.zzaV().zzj().zzc("Generating a payload for this event is not available. package_name, event_name", str4, str5);
            return null;
        }
        zzpg zzpgVar5 = zzlpVarZzn.zzg;
        com.google.android.gms.internal.measurement.zzhz zzhzVarZzh = com.google.android.gms.internal.measurement.zzib.zzh();
        zzpgVar5.zzj().zzb();
        try {
            zzh zzhVarZzu = zzpgVar5.zzj().zzu(str4);
            if (zzhVarZzu == null) {
                zzlpVarZzn.zzu.zzaV().zzj().zzb("Log and bundle not available. package_name", str4);
                bArr2 = new byte[0];
            } else {
                if (zzhVarZzu.zzD()) {
                    com.google.android.gms.internal.measurement.zzic zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                    zzicVarZzaE.zza(1);
                    zzicVarZzaE.zzC("android");
                    if (!TextUtils.isEmpty(zzhVarZzu.zzc())) {
                        zzicVarZzaE.zzL(zzhVarZzu.zzc());
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzv())) {
                        zzicVarZzaE.zzJ((String) Preconditions.checkNotNull(zzhVarZzu.zzv()));
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzr())) {
                        zzicVarZzaE.zzM((String) Preconditions.checkNotNull(zzhVarZzu.zzr()));
                    }
                    if (zzhVarZzu.zzt() != -2147483648L) {
                        zzicVarZzaE.zzaj((int) zzhVarZzu.zzt());
                    }
                    zzicVarZzaE.zzN(zzhVarZzu.zzx());
                    zzicVarZzaE.zzar(zzhVarZzu.zzB());
                    String strZzf = zzhVarZzu.zzf();
                    if (!TextUtils.isEmpty(strZzf)) {
                        zzicVarZzaE.zzad(strZzf);
                    }
                    zzicVarZzaE.zzay(zzhVarZzu.zzak());
                    zzjl zzjlVarZzB = zzlpVarZzn.zzg.zzB(str4);
                    zzicVarZzaE.zzY(zzhVarZzu.zzz());
                    if (zzicVar2.zzB() && zzlpVarZzn.zzu.zzc().zzC(zzicVarZzaE.zzK()) && zzjlVarZzB.zzo(zzjk.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzicVarZzaE.zzam(null);
                    }
                    zzicVarZzaE.zzat(zzjlVarZzB.zzk());
                    if (zzjlVarZzB.zzo(zzjk.AD_STORAGE) && zzhVarZzu.zzac()) {
                        Pair pairZzc = zzpgVar5.zzq().zzc(zzhVarZzu.zzc(), zzjlVarZzB);
                        if (!zzhVarZzu.zzac() || TextUtils.isEmpty((CharSequence) pairZzc.first)) {
                            zzic zzicVar3 = zzlpVarZzn.zzu;
                            zzicVar3.zzu().zzw();
                            zzicVarZzaE.zzF(Build.MODEL);
                            zzicVar3.zzu().zzw();
                            zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                            zzicVarZzaE.zzI((int) zzicVar3.zzu().zzb());
                            zzicVarZzaE.zzH(zzicVar3.zzu().zzc());
                            if (zzjlVarZzB.zzo(zzjk.ANALYTICS_STORAGE)) {
                                zzicVarZzaE.zzW(zzlp.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(zzbgVar.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpgVar2 = zzlpVarZzn.zzg;
                            listZzn = zzpgVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzpnVar = null;
                                    break;
                                }
                                zzpnVar = (zzpn) it.next();
                            } while (!"_lte".equals(zzpnVar.zzc));
                            if (zzpnVar != null) {
                                zzpn zzpnVar2 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzaZ().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar2);
                                zzpgVar2.zzj().zzl(zzpnVar2);
                            } else {
                                zzpn zzpnVar3 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzaZ().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar3);
                                zzpgVar2.zzj().zzl(zzpnVar3);
                            }
                            zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            for (i2 = 0; i2 < listZzn.size(); i2++) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm.zzb(((zzpn) listZzn.get(i2)).zzc);
                                zzitVarZzm.zza(((zzpn) listZzn.get(i2)).zzd);
                                zzpgVar2.zzp().zzc(zzitVarZzm, ((zzpn) listZzn.get(i2)).zze);
                                zziuVarArr[i2] = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm.zzbc();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                            zzpgVar3 = zzlpVarZzn.zzg;
                            zzpgVar3.zzI(zzhVarZzu, zzicVarZzaE);
                            zzpgVar3.zzJ(zzhVarZzu, zzicVarZzaE);
                            zzgv zzgvVarZza = zzgv.zza(zzbgVar);
                            zzicVar = zzlpVarZzn.zzu;
                            zzpp zzppVarZzk = zzicVar.zzk();
                            bundle = zzgvVarZza.zzd;
                            zzppVarZzk.zzI(bundle, zzpgVar2.zzj().zzU(str4));
                            zzicVar.zzk().zzG(zzgvVarZza, zzicVar.zzc().zzd(str4));
                            bundle.putLong("_c", 1L);
                            zzicVar.zzaV().zzj().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            str = zzbgVar.zzc;
                            bundle.putString("_o", str);
                            if (zzicVar.zzk().zzaa(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                zzicVar.zzk().zzM(bundle, "_dbg", 1L);
                                zzicVar.zzk().zzM(bundle, "_r", 1L);
                            }
                            zzav zzavVarZzj = zzpgVar2.zzj();
                            str2 = zzbgVar.zza;
                            zzbcVarZzf = zzavVarZzj.zzf(str4, str2);
                            if (zzbcVarZzf == null) {
                                zzpgVar4 = zzpgVar3;
                                obj = null;
                                z2 = true;
                                str3 = str;
                                bundle2 = bundle;
                                zzbcVarZza = new zzbc(str4, str2, 0L, 0L, 0L, zzbgVar.zzd, 0L, null, null, null, null);
                                j = 0;
                                zzhzVar = zzhzVarZzh;
                            } else {
                                zzpgVar4 = zzpgVar3;
                                bundle2 = bundle;
                                str3 = str;
                                obj = null;
                                z2 = true;
                                zzhzVar = zzhzVarZzh;
                                long j2 = zzbcVarZzf.zzf;
                                zzbcVarZza = zzbcVarZzf.zza(zzbgVar.zzd);
                                j = j2;
                            }
                            zzbc zzbcVar = zzbcVarZza;
                            zzpgVar2.zzj().zzh(zzbcVar);
                            zzpg zzpgVar6 = zzpgVar4;
                            boolean z3 = z2;
                            zzbb zzbbVar = new zzbb(zzlpVarZzn.zzu, str3, str4, str2, zzbgVar.zzd, j, bundle2);
                            zzhrVarZzk = com.google.android.gms.internal.measurement.zzhs.zzk();
                            zzhrVarZzk.zzo(zzbbVar.zzd);
                            zzhrVarZzk.zzl(zzbbVar.zzb);
                            zzhrVarZzk.zzq(zzbbVar.zze);
                            zzbeVar = zzbbVar.zzf;
                            zzbdVar = new zzbd(zzbeVar);
                            while (zzbdVar.hasNext()) {
                                String next = zzbdVar.next();
                                zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb(next);
                                objZza = zzbeVar.zza(next);
                                if (objZza != null) {
                                    zzpgVar2.zzp().zzd(zzhvVarZzn, objZza);
                                    zzhrVarZzk.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVarZzaE.zzg(zzhrVarZzk);
                            com.google.android.gms.internal.measurement.zzie zzieVarZza = com.google.android.gms.internal.measurement.zzig.zza();
                            com.google.android.gms.internal.measurement.zzht zzhtVarZza = com.google.android.gms.internal.measurement.zzhu.zza();
                            zzhtVarZza.zzb(zzbcVar.zzc);
                            zzhtVarZza.zza(str2);
                            zzieVarZza.zza(zzhtVarZza);
                            zzicVarZzaE.zzap(zzieVarZza);
                            zzicVarZzaE.zzaf(zzpgVar2.zzm().zzb(zzhVarZzu.zzc(), Collections.EMPTY_LIST, zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzk.zzn()), Long.valueOf(zzhrVarZzk.zzn()), false));
                            if (zzhrVarZzk.zzm()) {
                                zzicVarZzaE.zzv(zzhrVarZzk.zzn());
                                zzicVarZzaE.zzx(zzhrVarZzk.zzn());
                            }
                            jZzp = zzhVarZzu.zzp();
                            if (jZzp != 0) {
                                zzicVarZzaE.zzA(jZzp);
                            }
                            jZzn = zzhVarZzu.zzn();
                            if (jZzn != 0) {
                                zzicVarZzaE.zzy(jZzn);
                            } else if (jZzp != 0) {
                                zzicVarZzaE.zzy(jZzp);
                            }
                            strZzh = zzhVarZzu.zzh();
                            zzrb.zza();
                            if (zzicVar.zzc().zzp(str4, zzfy.zzaM)) {
                                zzicVarZzaE.zzau(strZzh);
                            }
                            zzhVarZzu.zzL();
                            zzicVarZzaE.zzZ((int) zzhVarZzu.zzG());
                            zzicVar.zzc().zzi();
                            zzicVarZzaE.zzO(133005L);
                            zzicVarZzaE.zzs(zzicVar.zzaZ().currentTimeMillis());
                            zzicVarZzaE.zzae(z3);
                            zzpgVar6.zzS(zzicVarZzaE.zzK(), zzicVarZzaE);
                            zzhzVar.zze(zzicVarZzaE);
                            zzhVarZzu.zzo(zzicVarZzaE.zzu());
                            zzhVarZzu.zzq(zzicVarZzaE.zzw());
                            zzpgVar2.zzj().zzv(zzhVarZzu, false, false);
                            zzpgVar2.zzj().zzc();
                            zzpgVar2.zzj().zzd();
                            return zzpgVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc()).zzcc());
                        }
                        try {
                            zzicVarZzaE.zzQ(zzlp.zzc((String) pairZzc.first, Long.toString(zzbgVar.zzd)));
                            Object obj2 = pairZzc.second;
                            if (obj2 != null) {
                                zzicVarZzaE.zzT(((Boolean) obj2).booleanValue());
                            }
                            zzic zzicVar4 = zzlpVarZzn.zzu;
                            zzicVar4.zzu().zzw();
                            zzicVarZzaE.zzF(Build.MODEL);
                            zzicVar4.zzu().zzw();
                            zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                            zzicVarZzaE.zzI((int) zzicVar4.zzu().zzb());
                            zzicVarZzaE.zzH(zzicVar4.zzu().zzc());
                            if (zzjlVarZzB.zzo(zzjk.ANALYTICS_STORAGE)) {
                                zzicVarZzaE.zzW(zzlp.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(zzbgVar.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpgVar2 = zzlpVarZzn.zzg;
                            listZzn = zzpgVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzpnVar = null;
                                    break;
                                }
                                zzpnVar = (zzpn) it.next();
                            } while (!"_lte".equals(zzpnVar.zzc));
                            if (zzpnVar != null) {
                                zzpn zzpnVar4 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzaZ().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar4);
                                zzpgVar2.zzj().zzl(zzpnVar4);
                            } else {
                                zzpn zzpnVar5 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzaZ().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar5);
                                zzpgVar2.zzj().zzl(zzpnVar5);
                            }
                            zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            while (i2 < listZzn.size()) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm2 = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm2.zzb(((zzpn) listZzn.get(i2)).zzc);
                                zzitVarZzm2.zza(((zzpn) listZzn.get(i2)).zzd);
                                zzpgVar2.zzp().zzc(zzitVarZzm2, ((zzpn) listZzn.get(i2)).zze);
                                zziuVarArr[i2] = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm2.zzbc();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                            zzpgVar3 = zzlpVarZzn.zzg;
                            zzpgVar3.zzI(zzhVarZzu, zzicVarZzaE);
                            zzpgVar3.zzJ(zzhVarZzu, zzicVarZzaE);
                            zzgv zzgvVarZza2 = zzgv.zza(zzbgVar);
                            zzicVar = zzlpVarZzn.zzu;
                            zzpp zzppVarZzk2 = zzicVar.zzk();
                            bundle = zzgvVarZza2.zzd;
                            zzppVarZzk2.zzI(bundle, zzpgVar2.zzj().zzU(str4));
                            zzicVar.zzk().zzG(zzgvVarZza2, zzicVar.zzc().zzd(str4));
                            bundle.putLong("_c", 1L);
                            zzicVar.zzaV().zzj().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            str = zzbgVar.zzc;
                            bundle.putString("_o", str);
                            if (zzicVar.zzk().zzaa(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                zzicVar.zzk().zzM(bundle, "_dbg", 1L);
                                zzicVar.zzk().zzM(bundle, "_r", 1L);
                            }
                            zzav zzavVarZzj2 = zzpgVar2.zzj();
                            str2 = zzbgVar.zza;
                            zzbcVarZzf = zzavVarZzj2.zzf(str4, str2);
                            if (zzbcVarZzf == null) {
                                zzpgVar4 = zzpgVar3;
                                obj = null;
                                z2 = true;
                                str3 = str;
                                bundle2 = bundle;
                                zzbcVarZza = new zzbc(str4, str2, 0L, 0L, 0L, zzbgVar.zzd, 0L, null, null, null, null);
                                j = 0;
                                zzhzVar = zzhzVarZzh;
                            } else {
                                zzpgVar4 = zzpgVar3;
                                bundle2 = bundle;
                                str3 = str;
                                obj = null;
                                z2 = true;
                                zzhzVar = zzhzVarZzh;
                                long j3 = zzbcVarZzf.zzf;
                                zzbcVarZza = zzbcVarZzf.zza(zzbgVar.zzd);
                                j = j3;
                            }
                            zzbc zzbcVar2 = zzbcVarZza;
                            zzpgVar2.zzj().zzh(zzbcVar2);
                            zzpg zzpgVar7 = zzpgVar4;
                            boolean z4 = z2;
                            zzbb zzbbVar2 = new zzbb(zzlpVarZzn.zzu, str3, str4, str2, zzbgVar.zzd, j, bundle2);
                            zzhrVarZzk = com.google.android.gms.internal.measurement.zzhs.zzk();
                            zzhrVarZzk.zzo(zzbbVar2.zzd);
                            zzhrVarZzk.zzl(zzbbVar2.zzb);
                            zzhrVarZzk.zzq(zzbbVar2.zze);
                            zzbeVar = zzbbVar2.zzf;
                            zzbdVar = new zzbd(zzbeVar);
                            while (zzbdVar.hasNext()) {
                                String next2 = zzbdVar.next();
                                zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb(next2);
                                objZza = zzbeVar.zza(next2);
                                if (objZza != null) {
                                    zzpgVar2.zzp().zzd(zzhvVarZzn, objZza);
                                    zzhrVarZzk.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVarZzaE.zzg(zzhrVarZzk);
                            com.google.android.gms.internal.measurement.zzie zzieVarZza2 = com.google.android.gms.internal.measurement.zzig.zza();
                            com.google.android.gms.internal.measurement.zzht zzhtVarZza2 = com.google.android.gms.internal.measurement.zzhu.zza();
                            zzhtVarZza2.zzb(zzbcVar2.zzc);
                            zzhtVarZza2.zza(str2);
                            zzieVarZza2.zza(zzhtVarZza2);
                            zzicVarZzaE.zzap(zzieVarZza2);
                            zzicVarZzaE.zzaf(zzpgVar2.zzm().zzb(zzhVarZzu.zzc(), Collections.EMPTY_LIST, zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzk.zzn()), Long.valueOf(zzhrVarZzk.zzn()), false));
                            if (zzhrVarZzk.zzm()) {
                                zzicVarZzaE.zzv(zzhrVarZzk.zzn());
                                zzicVarZzaE.zzx(zzhrVarZzk.zzn());
                            }
                            jZzp = zzhVarZzu.zzp();
                            if (jZzp != 0) {
                                zzicVarZzaE.zzA(jZzp);
                            }
                            jZzn = zzhVarZzu.zzn();
                            if (jZzn != 0) {
                                zzicVarZzaE.zzy(jZzn);
                            } else if (jZzp != 0) {
                                zzicVarZzaE.zzy(jZzp);
                            }
                            strZzh = zzhVarZzu.zzh();
                            zzrb.zza();
                            if (zzicVar.zzc().zzp(str4, zzfy.zzaM)) {
                                zzicVarZzaE.zzau(strZzh);
                            }
                            zzhVarZzu.zzL();
                            zzicVarZzaE.zzZ((int) zzhVarZzu.zzG());
                            zzicVar.zzc().zzi();
                            zzicVarZzaE.zzO(133005L);
                            zzicVarZzaE.zzs(zzicVar.zzaZ().currentTimeMillis());
                            zzicVarZzaE.zzae(z4);
                            zzpgVar7.zzS(zzicVarZzaE.zzK(), zzicVarZzaE);
                            zzhzVar.zze(zzicVarZzaE);
                            zzhVarZzu.zzo(zzicVarZzaE.zzu());
                            zzhVarZzu.zzq(zzicVarZzaE.zzw());
                            zzpgVar2.zzj().zzv(zzhVarZzu, false, false);
                            zzpgVar2.zzj().zzc();
                            zzpgVar2.zzj().zzd();
                            return zzpgVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc()).zzcc());
                        } catch (SecurityException e2) {
                            zzlpVarZzn.zzu.zzaV().zzj().zzb("Resettable device id encryption failed", e2.getMessage());
                            bArr = new byte[0];
                            zzpgVar = zzlpVarZzn.zzg;
                        }
                    } else {
                        zzic zzicVar5 = zzlpVarZzn.zzu;
                        zzicVar5.zzu().zzw();
                        zzicVarZzaE.zzF(Build.MODEL);
                        zzicVar5.zzu().zzw();
                        zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                        zzicVarZzaE.zzI((int) zzicVar5.zzu().zzb());
                        zzicVarZzaE.zzH(zzicVar5.zzu().zzc());
                        try {
                            if (zzjlVarZzB.zzo(zzjk.ANALYTICS_STORAGE) && zzhVarZzu.zzd() != null) {
                                zzicVarZzaE.zzW(zzlp.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(zzbgVar.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpgVar2 = zzlpVarZzn.zzg;
                            listZzn = zzpgVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzpnVar = null;
                                    break;
                                }
                                zzpnVar = (zzpn) it.next();
                            } while (!"_lte".equals(zzpnVar.zzc));
                            if (zzpnVar != null || zzpnVar.zze == null) {
                                zzpn zzpnVar6 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzaZ().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar6);
                                zzpgVar2.zzj().zzl(zzpnVar6);
                            }
                            zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            while (i2 < listZzn.size()) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm3 = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm3.zzb(((zzpn) listZzn.get(i2)).zzc);
                                zzitVarZzm3.zza(((zzpn) listZzn.get(i2)).zzd);
                                zzpgVar2.zzp().zzc(zzitVarZzm3, ((zzpn) listZzn.get(i2)).zze);
                                zziuVarArr[i2] = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm3.zzbc();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                            zzpgVar3 = zzlpVarZzn.zzg;
                            zzpgVar3.zzI(zzhVarZzu, zzicVarZzaE);
                            zzpgVar3.zzJ(zzhVarZzu, zzicVarZzaE);
                            zzgv zzgvVarZza3 = zzgv.zza(zzbgVar);
                            zzicVar = zzlpVarZzn.zzu;
                            zzpp zzppVarZzk3 = zzicVar.zzk();
                            bundle = zzgvVarZza3.zzd;
                            zzppVarZzk3.zzI(bundle, zzpgVar2.zzj().zzU(str4));
                            zzicVar.zzk().zzG(zzgvVarZza3, zzicVar.zzc().zzd(str4));
                            bundle.putLong("_c", 1L);
                            zzicVar.zzaV().zzj().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            str = zzbgVar.zzc;
                            bundle.putString("_o", str);
                            if (zzicVar.zzk().zzaa(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                zzicVar.zzk().zzM(bundle, "_dbg", 1L);
                                zzicVar.zzk().zzM(bundle, "_r", 1L);
                            }
                            zzav zzavVarZzj3 = zzpgVar2.zzj();
                            str2 = zzbgVar.zza;
                            zzbcVarZzf = zzavVarZzj3.zzf(str4, str2);
                            if (zzbcVarZzf == null) {
                                zzpgVar4 = zzpgVar3;
                                obj = null;
                                z2 = true;
                                str3 = str;
                                bundle2 = bundle;
                                zzbcVarZza = new zzbc(str4, str2, 0L, 0L, 0L, zzbgVar.zzd, 0L, null, null, null, null);
                                j = 0;
                                zzhzVar = zzhzVarZzh;
                            } else {
                                zzpgVar4 = zzpgVar3;
                                bundle2 = bundle;
                                str3 = str;
                                obj = null;
                                z2 = true;
                                zzhzVar = zzhzVarZzh;
                                long j4 = zzbcVarZzf.zzf;
                                zzbcVarZza = zzbcVarZzf.zza(zzbgVar.zzd);
                                j = j4;
                            }
                            zzbc zzbcVar3 = zzbcVarZza;
                            zzpgVar2.zzj().zzh(zzbcVar3);
                            zzpg zzpgVar8 = zzpgVar4;
                            boolean z5 = z2;
                            zzbb zzbbVar3 = new zzbb(zzlpVarZzn.zzu, str3, str4, str2, zzbgVar.zzd, j, bundle2);
                            zzhrVarZzk = com.google.android.gms.internal.measurement.zzhs.zzk();
                            zzhrVarZzk.zzo(zzbbVar3.zzd);
                            zzhrVarZzk.zzl(zzbbVar3.zzb);
                            zzhrVarZzk.zzq(zzbbVar3.zze);
                            zzbeVar = zzbbVar3.zzf;
                            zzbdVar = new zzbd(zzbeVar);
                            while (zzbdVar.hasNext()) {
                                String next3 = zzbdVar.next();
                                zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb(next3);
                                objZza = zzbeVar.zza(next3);
                                if (objZza != null) {
                                    zzpgVar2.zzp().zzd(zzhvVarZzn, objZza);
                                    zzhrVarZzk.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVarZzaE.zzg(zzhrVarZzk);
                            com.google.android.gms.internal.measurement.zzie zzieVarZza3 = com.google.android.gms.internal.measurement.zzig.zza();
                            com.google.android.gms.internal.measurement.zzht zzhtVarZza3 = com.google.android.gms.internal.measurement.zzhu.zza();
                            zzhtVarZza3.zzb(zzbcVar3.zzc);
                            zzhtVarZza3.zza(str2);
                            zzieVarZza3.zza(zzhtVarZza3);
                            zzicVarZzaE.zzap(zzieVarZza3);
                            zzicVarZzaE.zzaf(zzpgVar2.zzm().zzb(zzhVarZzu.zzc(), Collections.EMPTY_LIST, zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzk.zzn()), Long.valueOf(zzhrVarZzk.zzn()), false));
                            if (zzhrVarZzk.zzm()) {
                                zzicVarZzaE.zzv(zzhrVarZzk.zzn());
                                zzicVarZzaE.zzx(zzhrVarZzk.zzn());
                            }
                            jZzp = zzhVarZzu.zzp();
                            if (jZzp != 0) {
                                zzicVarZzaE.zzA(jZzp);
                            }
                            jZzn = zzhVarZzu.zzn();
                            if (jZzn != 0) {
                                zzicVarZzaE.zzy(jZzn);
                            } else if (jZzp != 0) {
                                zzicVarZzaE.zzy(jZzp);
                            }
                            strZzh = zzhVarZzu.zzh();
                            zzrb.zza();
                            if (zzicVar.zzc().zzp(str4, zzfy.zzaM) && strZzh != null) {
                                zzicVarZzaE.zzau(strZzh);
                            }
                            zzhVarZzu.zzL();
                            zzicVarZzaE.zzZ((int) zzhVarZzu.zzG());
                            zzicVar.zzc().zzi();
                            zzicVarZzaE.zzO(133005L);
                            zzicVarZzaE.zzs(zzicVar.zzaZ().currentTimeMillis());
                            zzicVarZzaE.zzae(z5);
                            zzpgVar8.zzS(zzicVarZzaE.zzK(), zzicVarZzaE);
                            zzhzVar.zze(zzicVarZzaE);
                            zzhVarZzu.zzo(zzicVarZzaE.zzu());
                            zzhVarZzu.zzq(zzicVarZzaE.zzw());
                            zzpgVar2.zzj().zzv(zzhVarZzu, false, false);
                            zzpgVar2.zzj().zzc();
                            zzpgVar2.zzj().zzd();
                            try {
                                return zzpgVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc()).zzcc());
                            } catch (IOException e3) {
                                zzlpVarZzn.zzu.zzaV().zzb().zzc("Data loss. Failed to bundle and serialize. appId", zzgu.zzl(str4), e3);
                                return obj;
                            }
                        } catch (SecurityException e4) {
                            zzlpVarZzn.zzu.zzaV().zzj().zzb("app instance id encryption failed", e4.getMessage());
                            bArr = new byte[0];
                            zzpgVar = zzlpVarZzn.zzg;
                        }
                    }
                    zzpgVar.zzj().zzd();
                    return bArr;
                }
                zzlpVarZzn.zzu.zzaV().zzj().zzb("Log and bundle disabled. package_name", str4);
                bArr2 = new byte[0];
            }
            zzpgVar5.zzj().zzd();
            return bArr2;
        } catch (Throwable th) {
            zzlpVarZzn.zzg.zzj().zzd();
            throw th;
        }
    }
}
