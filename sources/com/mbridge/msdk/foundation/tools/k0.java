package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<Character, Character> f34132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f34133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f34134c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f34135d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap map = new HashMap();
        f34132a = map;
        map.put('v', 'A');
        f34132a.put('S', 'B');
        f34132a.put('o', 'C');
        f34132a.put('a', 'D');
        f34132a.put('j', 'E');
        f34132a.put('c', 'F');
        f34132a.put('7', 'G');
        f34132a.put('d', 'H');
        f34132a.put('R', 'I');
        f34132a.put('z', 'J');
        f34132a.put('p', 'K');
        f34132a.put('W', 'L');
        f34132a.put('i', 'M');
        f34132a.put('f', 'N');
        f34132a.put('G', 'O');
        f34132a.put('y', 'P');
        f34132a.put('N', 'Q');
        f34132a.put('x', 'R');
        f34132a.put('Z', 'S');
        f34132a.put('n', 'T');
        f34132a.put('V', 'U');
        f34132a.put('5', 'V');
        f34132a.put('k', 'W');
        f34132a.put('+', 'X');
        f34132a.put('D', 'Y');
        f34132a.put('H', 'Z');
        f34132a.put('L', 'a');
        f34132a.put('Y', 'b');
        f34132a.put('h', 'c');
        f34132a.put('J', 'd');
        f34132a.put('4', 'e');
        f34132a.put('6', 'f');
        f34132a.put('l', 'g');
        f34132a.put('t', 'h');
        f34132a.put('0', 'i');
        f34132a.put('U', 'j');
        f34132a.put('3', 'k');
        f34132a.put('Q', 'l');
        f34132a.put('r', 'm');
        f34132a.put('g', 'n');
        f34132a.put('E', 'o');
        f34132a.put('u', 'p');
        f34132a.put('q', 'q');
        f34132a.put('8', 'r');
        f34132a.put('s', 's');
        f34132a.put('w', 't');
        f34132a.put('/', 'u');
        f34132a.put('X', 'v');
        f34132a.put('M', 'w');
        f34132a.put('e', 'x');
        f34132a.put('B', 'y');
        f34132a.put('A', 'z');
        f34132a.put('T', '0');
        f34132a.put('2', '1');
        f34132a.put('F', '2');
        f34132a.put('b', '3');
        f34132a.put('9', '4');
        f34132a.put('P', '5');
        f34132a.put('1', '6');
        f34132a.put('O', '7');
        f34132a.put('I', '8');
        f34132a.put('K', '9');
        f34132a.put('m', '+');
        f34132a.put('C', '/');
        HashMap map2 = new HashMap();
        f34133b = map2;
        map2.put('A', 'v');
        f34133b.put('B', 'S');
        f34133b.put('C', 'o');
        f34133b.put('D', 'a');
        f34133b.put('E', 'j');
        f34133b.put('F', 'c');
        f34133b.put('G', '7');
        f34133b.put('H', 'd');
        f34133b.put('I', 'R');
        f34133b.put('J', 'z');
        f34133b.put('K', 'p');
        f34133b.put('L', 'W');
        f34133b.put('M', 'i');
        f34133b.put('N', 'f');
        f34133b.put('O', 'G');
        f34133b.put('P', 'y');
        f34133b.put('Q', 'N');
        f34133b.put('R', 'x');
        f34133b.put('S', 'Z');
        f34133b.put('T', 'n');
        f34133b.put('U', 'V');
        f34133b.put('V', '5');
        f34133b.put('W', 'k');
        f34133b.put('X', '+');
        f34133b.put('Y', 'D');
        f34133b.put('Z', 'H');
        f34133b.put('a', 'L');
        f34133b.put('b', 'Y');
        f34133b.put('c', 'h');
        f34133b.put('d', 'J');
        f34133b.put('e', '4');
        f34133b.put('f', '6');
        f34133b.put('g', 'l');
        f34133b.put('h', 't');
        f34133b.put('i', '0');
        f34133b.put('j', 'U');
        f34133b.put('k', '3');
        f34133b.put('l', 'Q');
        f34133b.put('m', 'r');
        f34133b.put('n', 'g');
        f34133b.put('o', 'E');
        f34133b.put('p', 'u');
        f34133b.put('q', 'q');
        f34133b.put('r', '8');
        f34133b.put('s', 's');
        f34133b.put('t', 'w');
        f34133b.put('u', '/');
        f34133b.put('v', 'X');
        f34133b.put('w', 'M');
        f34133b.put('x', 'e');
        f34133b.put('y', 'B');
        f34133b.put('z', 'A');
        f34133b.put('0', 'T');
        f34133b.put('1', '2');
        f34133b.put('2', 'F');
        f34133b.put('3', 'b');
        f34133b.put('4', '9');
        f34133b.put('5', 'P');
        f34133b.put('6', '1');
        f34133b.put('7', 'O');
        f34133b.put('8', 'I');
        f34133b.put('9', 'K');
        f34133b.put('+', 'm');
        f34133b.put('/', 'C');
    }

    public static String a(String str) {
        return r0.b(str);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : r0.c(str);
    }
}
