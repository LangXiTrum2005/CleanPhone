package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.PixmapTextureData;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.OrderedMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class PixmapPacker implements Disposable {
    static Pattern indexPattern = Pattern.compile("(.+)_(\\d+)$");
    int alphaThreshold;
    private Color c;
    boolean disposed;
    boolean duplicateBorder;
    PackStrategy packStrategy;
    boolean packToTexture;
    int padding;
    Pixmap.Format pageFormat;
    int pageHeight;
    int pageWidth;
    final Array<Page> pages;
    boolean stripWhitespaceX;
    boolean stripWhitespaceY;
    Color transparentColor;

    public static class GuillotineStrategy implements PackStrategy {
        Comparator<Pixmap> comparator;

        public static class GuillotinePage extends Page {
            Node root;

            public GuillotinePage(PixmapPacker pixmapPacker) {
                super(pixmapPacker);
                Node node = new Node();
                this.root = node;
                Rectangle rectangle = node.rect;
                int i = pixmapPacker.padding;
                rectangle.x = i;
                rectangle.y = i;
                rectangle.width = pixmapPacker.pageWidth - (i * 2);
                rectangle.height = pixmapPacker.pageHeight - (i * 2);
            }
        }

        public static final class Node {
            public boolean full;
            public Node leftChild;
            public final Rectangle rect = new Rectangle();
            public Node rightChild;
        }

        private Node insert(Node node, Rectangle rectangle) {
            Node node2;
            boolean z = node.full;
            if (!z && (node2 = node.leftChild) != null && node.rightChild != null) {
                Node nodeInsert = insert(node2, rectangle);
                return nodeInsert == null ? insert(node.rightChild, rectangle) : nodeInsert;
            }
            if (z) {
                return null;
            }
            Rectangle rectangle2 = node.rect;
            float f = rectangle2.width;
            float f2 = rectangle.width;
            if (f == f2 && rectangle2.height == rectangle.height) {
                return node;
            }
            if (f < f2 || rectangle2.height < rectangle.height) {
                return null;
            }
            node.leftChild = new Node();
            Node node3 = new Node();
            node.rightChild = node3;
            Rectangle rectangle3 = node.rect;
            float f3 = rectangle3.width;
            float f4 = rectangle.width;
            int i = ((int) f3) - ((int) f4);
            float f5 = rectangle3.height;
            float f6 = rectangle.height;
            if (i > ((int) f5) - ((int) f6)) {
                Rectangle rectangle4 = node.leftChild.rect;
                rectangle4.x = rectangle3.x;
                rectangle4.y = rectangle3.y;
                rectangle4.width = f4;
                rectangle4.height = f5;
                Rectangle rectangle5 = node3.rect;
                float f7 = rectangle3.x;
                float f8 = rectangle.width;
                rectangle5.x = f7 + f8;
                rectangle5.y = rectangle3.y;
                rectangle5.width = rectangle3.width - f8;
                rectangle5.height = rectangle3.height;
            } else {
                Rectangle rectangle6 = node.leftChild.rect;
                rectangle6.x = rectangle3.x;
                rectangle6.y = rectangle3.y;
                rectangle6.width = f3;
                rectangle6.height = f6;
                Rectangle rectangle7 = node3.rect;
                rectangle7.x = rectangle3.x;
                float f9 = rectangle3.y;
                float f10 = rectangle.height;
                rectangle7.y = f9 + f10;
                rectangle7.width = rectangle3.width;
                rectangle7.height = rectangle3.height - f10;
            }
            return insert(node.leftChild, rectangle);
        }

        @Override // com.badlogic.gdx.graphics.g2d.PixmapPacker.PackStrategy
        public Page pack(PixmapPacker pixmapPacker, String str, Rectangle rectangle) {
            GuillotinePage guillotinePage;
            Array<Page> array = pixmapPacker.pages;
            if (array.size == 0) {
                guillotinePage = new GuillotinePage(pixmapPacker);
                pixmapPacker.pages.add(guillotinePage);
            } else {
                guillotinePage = (GuillotinePage) array.peek();
            }
            float f = pixmapPacker.padding;
            rectangle.width += f;
            rectangle.height += f;
            Node nodeInsert = insert(guillotinePage.root, rectangle);
            if (nodeInsert == null) {
                guillotinePage = new GuillotinePage(pixmapPacker);
                pixmapPacker.pages.add(guillotinePage);
                nodeInsert = insert(guillotinePage.root, rectangle);
            }
            nodeInsert.full = true;
            Rectangle rectangle2 = nodeInsert.rect;
            rectangle.set(rectangle2.x, rectangle2.y, rectangle2.width - f, rectangle2.height - f);
            return guillotinePage;
        }

        @Override // com.badlogic.gdx.graphics.g2d.PixmapPacker.PackStrategy
        public void sort(Array<Pixmap> array) {
            if (this.comparator == null) {
                this.comparator = new Comparator<Pixmap>() { // from class: com.badlogic.gdx.graphics.g2d.PixmapPacker.GuillotineStrategy.1
                    @Override // java.util.Comparator
                    public int compare(Pixmap pixmap, Pixmap pixmap2) {
                        return Math.max(pixmap.getWidth(), pixmap.getHeight()) - Math.max(pixmap2.getWidth(), pixmap2.getHeight());
                    }
                };
            }
            array.sort(this.comparator);
        }
    }

    public interface PackStrategy {
        Page pack(PixmapPacker pixmapPacker, String str, Rectangle rectangle);

        void sort(Array<Pixmap> array);
    }

    public static class Page {
        boolean dirty;
        Pixmap image;
        Texture texture;
        OrderedMap<String, PixmapPackerRectangle> rects = new OrderedMap<>();
        final Array<String> addedRects = new Array<>();

        public Page(PixmapPacker pixmapPacker) {
            Pixmap pixmap = new Pixmap(pixmapPacker.pageWidth, pixmapPacker.pageHeight, pixmapPacker.pageFormat);
            this.image = pixmap;
            pixmap.setBlending(Pixmap.Blending.None);
            this.image.setColor(pixmapPacker.getTransparentColor());
            this.image.fill();
        }

        public Pixmap getPixmap() {
            return this.image;
        }

        public OrderedMap<String, PixmapPackerRectangle> getRects() {
            return this.rects;
        }

        public Texture getTexture() {
            return this.texture;
        }

        public boolean updateTexture(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, boolean z) {
            Texture texture = this.texture;
            if (texture == null) {
                Pixmap pixmap = this.image;
                Texture texture2 = new Texture(new PixmapTextureData(pixmap, pixmap.getFormat(), z, false, true)) { // from class: com.badlogic.gdx.graphics.g2d.PixmapPacker.Page.1
                    @Override // com.badlogic.gdx.graphics.Texture, com.badlogic.gdx.graphics.GLTexture, com.badlogic.gdx.utils.Disposable
                    public void dispose() {
                        super.dispose();
                        Page.this.image.dispose();
                    }
                };
                this.texture = texture2;
                texture2.setFilter(textureFilter, textureFilter2);
            } else {
                if (!this.dirty) {
                    return false;
                }
                texture.load(texture.getTextureData());
            }
            this.dirty = false;
            return true;
        }
    }

    public static class SkylineStrategy implements PackStrategy {
        Comparator<Pixmap> comparator;

        public static class SkylinePage extends Page {
            Array<Row> rows;

            public static class Row {
                int height;
                int x;
                int y;
            }

            public SkylinePage(PixmapPacker pixmapPacker) {
                super(pixmapPacker);
                this.rows = new Array<>();
            }
        }

        /* JADX WARN: Code duplicated, block: B:37:0x008d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:38:0x009b A[SYNTHETIC] */
        @Override // com.badlogic.gdx.graphics.g2d.PixmapPacker.PackStrategy
        public Page pack(PixmapPacker pixmapPacker, String str, Rectangle rectangle) {
            int i;
            int i2 = pixmapPacker.padding;
            int i3 = i2 * 2;
            int i4 = pixmapPacker.pageWidth - i3;
            int i5 = pixmapPacker.pageHeight - i3;
            int i6 = ((int) rectangle.width) + i2;
            int i7 = ((int) rectangle.height) + i2;
            int i8 = pixmapPacker.pages.size;
            for (int i9 = 0; i9 < i8; i9++) {
                SkylinePage skylinePage = (SkylinePage) pixmapPacker.pages.get(i9);
                int i10 = skylinePage.rows.size - 1;
                SkylinePage.Row row = null;
                for (int i11 = 0; i11 < i10; i11++) {
                    SkylinePage.Row row2 = skylinePage.rows.get(i11);
                    if (row2.x + i6 < i4 && row2.y + i7 < i5 && i7 <= (i = row2.height) && (row == null || i < row.height)) {
                        row = row2;
                    }
                }
                if (row == null) {
                    SkylinePage.Row rowPeek = skylinePage.rows.peek();
                    int i12 = rowPeek.y;
                    if (i12 + i7 < i5) {
                        if (rowPeek.x + i6 < i4) {
                            rowPeek.height = Math.max(rowPeek.height, i7);
                            row = rowPeek;
                        } else if (i12 + rowPeek.height + i7 < i5) {
                            row = new SkylinePage.Row();
                            row.y = rowPeek.y + rowPeek.height;
                            row.height = i7;
                            skylinePage.rows.add(row);
                        }
                        if (row != null) {
                            int i13 = row.x;
                            rectangle.x = i13;
                            rectangle.y = row.y;
                            row.x = i13 + i6;
                            return skylinePage;
                        }
                    } else {
                        continue;
                    }
                } else if (row != null) {
                    int i14 = row.x;
                    rectangle.x = i14;
                    rectangle.y = row.y;
                    row.x = i14 + i6;
                    return skylinePage;
                }
            }
            SkylinePage skylinePage2 = new SkylinePage(pixmapPacker);
            pixmapPacker.pages.add(skylinePage2);
            SkylinePage.Row row3 = new SkylinePage.Row();
            row3.x = i6 + i2;
            row3.y = i2;
            row3.height = i7;
            skylinePage2.rows.add(row3);
            float f = i2;
            rectangle.x = f;
            rectangle.y = f;
            return skylinePage2;
        }

        @Override // com.badlogic.gdx.graphics.g2d.PixmapPacker.PackStrategy
        public void sort(Array<Pixmap> array) {
            if (this.comparator == null) {
                this.comparator = new Comparator<Pixmap>() { // from class: com.badlogic.gdx.graphics.g2d.PixmapPacker.SkylineStrategy.1
                    @Override // java.util.Comparator
                    public int compare(Pixmap pixmap, Pixmap pixmap2) {
                        return pixmap.getHeight() - pixmap2.getHeight();
                    }
                };
            }
            array.sort(this.comparator);
        }
    }

    public PixmapPacker(int i, int i2, Pixmap.Format format, int i3, boolean z) {
        this(i, i2, format, i3, z, false, false, new GuillotineStrategy());
    }

    private int[] getPads(Pixmap pixmap, int[] iArr) {
        int width;
        int height = pixmap.getHeight() - 1;
        int width2 = pixmap.getWidth() - 1;
        int splitPoint = getSplitPoint(pixmap, 1, height, true, true);
        int splitPoint2 = getSplitPoint(pixmap, width2, 1, true, false);
        int splitPoint3 = splitPoint != 0 ? getSplitPoint(pixmap, splitPoint + 1, height, false, true) : 0;
        int splitPoint4 = splitPoint2 != 0 ? getSplitPoint(pixmap, width2, splitPoint2 + 1, false, false) : 0;
        getSplitPoint(pixmap, splitPoint3 + 1, height, true, true);
        getSplitPoint(pixmap, width2, splitPoint4 + 1, true, false);
        if (splitPoint == 0 && splitPoint3 == 0 && splitPoint2 == 0 && splitPoint4 == 0) {
            return null;
        }
        int height2 = -1;
        if (splitPoint == 0 && splitPoint3 == 0) {
            width = -1;
            splitPoint = -1;
        } else if (splitPoint > 0) {
            splitPoint--;
            width = (pixmap.getWidth() - 2) - (splitPoint3 - 1);
        } else {
            width = pixmap.getWidth() - 2;
        }
        if (splitPoint2 == 0 && splitPoint4 == 0) {
            splitPoint2 = -1;
        } else if (splitPoint2 > 0) {
            splitPoint2--;
            height2 = (pixmap.getHeight() - 2) - (splitPoint4 - 1);
        } else {
            height2 = pixmap.getHeight() - 2;
        }
        int[] iArr2 = {splitPoint, width, splitPoint2, height2};
        if (iArr == null || !Arrays.equals(iArr2, iArr)) {
            return iArr2;
        }
        return null;
    }

    private int getSplitPoint(Pixmap pixmap, int i, int i2, boolean z, boolean z2) {
        int[] iArr = new int[4];
        int i3 = z2 ? i : i2;
        int width = z2 ? pixmap.getWidth() : pixmap.getHeight();
        int i4 = z ? 255 : 0;
        int i5 = i2;
        int i6 = i;
        for (int i7 = i3; i7 != width; i7++) {
            if (z2) {
                i6 = i7;
            } else {
                i5 = i7;
            }
            this.c.set(pixmap.getPixel(i6, i5));
            Color color = this.c;
            int i8 = (int) (color.r * 255.0f);
            iArr[0] = i8;
            int i9 = (int) (color.g * 255.0f);
            iArr[1] = i9;
            int i10 = (int) (color.b * 255.0f);
            iArr[2] = i10;
            int i11 = (int) (color.f202a * 255.0f);
            iArr[3] = i11;
            if (i11 == i4) {
                return i7;
            }
            if (!z && (i8 != 0 || i9 != 0 || i10 != 0 || i11 != 255)) {
                System.out.println(i6 + "  " + i5 + " " + iArr + " ");
            }
        }
        return 0;
    }

    private int[] getSplits(Pixmap pixmap) {
        int width;
        int height;
        int splitPoint = getSplitPoint(pixmap, 1, 0, true, true);
        int splitPoint2 = getSplitPoint(pixmap, splitPoint, 0, false, true);
        int splitPoint3 = getSplitPoint(pixmap, 0, 1, true, false);
        int splitPoint4 = getSplitPoint(pixmap, 0, splitPoint3, false, false);
        getSplitPoint(pixmap, splitPoint2 + 1, 0, true, true);
        getSplitPoint(pixmap, 0, splitPoint4 + 1, true, false);
        if (splitPoint == 0 && splitPoint2 == 0 && splitPoint3 == 0 && splitPoint4 == 0) {
            return null;
        }
        if (splitPoint != 0) {
            splitPoint--;
            width = (pixmap.getWidth() - 2) - (splitPoint2 - 1);
        } else {
            width = pixmap.getWidth() - 2;
        }
        if (splitPoint3 != 0) {
            splitPoint3--;
            height = (pixmap.getHeight() - 2) - (splitPoint4 - 1);
        } else {
            height = pixmap.getHeight() - 2;
        }
        return new int[]{splitPoint, width, splitPoint3, height};
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public synchronized void dispose() {
        try {
            Array.ArrayIterator<Page> it = this.pages.iterator();
            while (it.hasNext()) {
                Page next = it.next();
                if (next.texture == null) {
                    next.image.dispose();
                }
            }
            this.disposed = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized TextureAtlas generateTextureAtlas(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, boolean z) {
        TextureAtlas textureAtlas;
        textureAtlas = new TextureAtlas();
        updateTextureAtlas(textureAtlas, textureFilter, textureFilter2, z);
        return textureAtlas;
    }

    public boolean getDuplicateBorder() {
        return this.duplicateBorder;
    }

    public boolean getPackToTexture() {
        return this.packToTexture;
    }

    public int getPadding() {
        return this.padding;
    }

    public synchronized Page getPage(String str) {
        Array.ArrayIterator<Page> it = this.pages.iterator();
        while (it.hasNext()) {
            Page next = it.next();
            if (next.rects.get(str) != null) {
                return next;
            }
        }
        return null;
    }

    public Pixmap.Format getPageFormat() {
        return this.pageFormat;
    }

    public int getPageHeight() {
        return this.pageHeight;
    }

    public synchronized int getPageIndex(String str) {
        int i = 0;
        while (true) {
            Array<Page> array = this.pages;
            if (i >= array.size) {
                return -1;
            }
            if (array.get(i).rects.get(str) != null) {
                return i;
            }
            i++;
        }
    }

    public int getPageWidth() {
        return this.pageWidth;
    }

    public Array<Page> getPages() {
        return this.pages;
    }

    public synchronized Rectangle getRect(String str) {
        Array.ArrayIterator<Page> it = this.pages.iterator();
        while (it.hasNext()) {
            PixmapPackerRectangle pixmapPackerRectangle = it.next().rects.get(str);
            if (pixmapPackerRectangle != null) {
                return pixmapPackerRectangle;
            }
        }
        return null;
    }

    public Color getTransparentColor() {
        return this.transparentColor;
    }

    public synchronized PixmapPackerRectangle pack(Pixmap pixmap) {
        return pack(null, pixmap);
    }

    public void setDuplicateBorder(boolean z) {
        this.duplicateBorder = z;
    }

    public void setPackToTexture(boolean z) {
        this.packToTexture = z;
    }

    public void setPadding(int i) {
        this.padding = i;
    }

    public void setPageFormat(Pixmap.Format format) {
        this.pageFormat = format;
    }

    public void setPageHeight(int i) {
        this.pageHeight = i;
    }

    public void setPageWidth(int i) {
        this.pageWidth = i;
    }

    public void setTransparentColor(Color color) {
        this.transparentColor.set(color);
    }

    public void sort(Array<Pixmap> array) {
        this.packStrategy.sort(array);
    }

    public synchronized void updatePageTextures(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, boolean z) {
        Array.ArrayIterator<Page> it = this.pages.iterator();
        while (it.hasNext()) {
            it.next().updateTexture(textureFilter, textureFilter2, z);
        }
    }

    public synchronized void updateTextureAtlas(TextureAtlas textureAtlas, Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, boolean z) {
        updateTextureAtlas(textureAtlas, textureFilter, textureFilter2, z, true);
    }

    public synchronized void updateTextureRegions(Array<TextureRegion> array, Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, boolean z) {
        updatePageTextures(textureFilter, textureFilter2, z);
        while (true) {
            int i = array.size;
            Array<Page> array2 = this.pages;
            if (i < array2.size) {
                array.add(new TextureRegion(array2.get(i).texture));
            }
        }
    }

    public PixmapPacker(int i, int i2, Pixmap.Format format, int i3, boolean z, PackStrategy packStrategy) {
        this(i, i2, format, i3, z, false, false, packStrategy);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e7 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0009, B:10:0x0012, B:13:0x0019, B:14:0x0022, B:19:0x002a, B:21:0x0032, B:80:0x0175, B:82:0x0180, B:85:0x018d, B:87:0x0195, B:88:0x019f, B:90:0x01af, B:92:0x01b3, B:94:0x01b7, B:96:0x01bb, B:98:0x01de, B:100:0x01e7, B:102:0x02a3, B:103:0x02a6, B:97:0x01dc, B:107:0x02ac, B:108:0x02b3, B:109:0x02b4, B:110:0x02ca, B:23:0x008c, B:25:0x0090, B:28:0x0095, B:29:0x00a5, B:32:0x00b7, B:35:0x00be, B:37:0x00c4, B:40:0x00cf, B:41:0x00d2, B:42:0x00d7, B:43:0x00db, B:46:0x00e0, B:48:0x00e6, B:51:0x00f1, B:52:0x00f4, B:55:0x00fc, B:58:0x0105, B:62:0x010f, B:65:0x011a, B:66:0x011d, B:67:0x0122, B:68:0x0126, B:72:0x012e, B:75:0x0139, B:76:0x013c, B:79:0x0144), top: B:113:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x02a3 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0009, B:10:0x0012, B:13:0x0019, B:14:0x0022, B:19:0x002a, B:21:0x0032, B:80:0x0175, B:82:0x0180, B:85:0x018d, B:87:0x0195, B:88:0x019f, B:90:0x01af, B:92:0x01b3, B:94:0x01b7, B:96:0x01bb, B:98:0x01de, B:100:0x01e7, B:102:0x02a3, B:103:0x02a6, B:97:0x01dc, B:107:0x02ac, B:108:0x02b3, B:109:0x02b4, B:110:0x02ca, B:23:0x008c, B:25:0x0090, B:28:0x0095, B:29:0x00a5, B:32:0x00b7, B:35:0x00be, B:37:0x00c4, B:40:0x00cf, B:41:0x00d2, B:42:0x00d7, B:43:0x00db, B:46:0x00e0, B:48:0x00e6, B:51:0x00f1, B:52:0x00f4, B:55:0x00fc, B:58:0x0105, B:62:0x010f, B:65:0x011a, B:66:0x011d, B:67:0x0122, B:68:0x0126, B:72:0x012e, B:75:0x0139, B:76:0x013c, B:79:0x0144), top: B:113:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02ac A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0009, B:10:0x0012, B:13:0x0019, B:14:0x0022, B:19:0x002a, B:21:0x0032, B:80:0x0175, B:82:0x0180, B:85:0x018d, B:87:0x0195, B:88:0x019f, B:90:0x01af, B:92:0x01b3, B:94:0x01b7, B:96:0x01bb, B:98:0x01de, B:100:0x01e7, B:102:0x02a3, B:103:0x02a6, B:97:0x01dc, B:107:0x02ac, B:108:0x02b3, B:109:0x02b4, B:110:0x02ca, B:23:0x008c, B:25:0x0090, B:28:0x0095, B:29:0x00a5, B:32:0x00b7, B:35:0x00be, B:37:0x00c4, B:40:0x00cf, B:41:0x00d2, B:42:0x00d7, B:43:0x00db, B:46:0x00e0, B:48:0x00e6, B:51:0x00f1, B:52:0x00f4, B:55:0x00fc, B:58:0x0105, B:62:0x010f, B:65:0x011a, B:66:0x011d, B:67:0x0122, B:68:0x0126, B:72:0x012e, B:75:0x0139, B:76:0x013c, B:79:0x0144), top: B:113:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02b4 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0009, B:10:0x0012, B:13:0x0019, B:14:0x0022, B:19:0x002a, B:21:0x0032, B:80:0x0175, B:82:0x0180, B:85:0x018d, B:87:0x0195, B:88:0x019f, B:90:0x01af, B:92:0x01b3, B:94:0x01b7, B:96:0x01bb, B:98:0x01de, B:100:0x01e7, B:102:0x02a3, B:103:0x02a6, B:97:0x01dc, B:107:0x02ac, B:108:0x02b3, B:109:0x02b4, B:110:0x02ca, B:23:0x008c, B:25:0x0090, B:28:0x0095, B:29:0x00a5, B:32:0x00b7, B:35:0x00be, B:37:0x00c4, B:40:0x00cf, B:41:0x00d2, B:42:0x00d7, B:43:0x00db, B:46:0x00e0, B:48:0x00e6, B:51:0x00f1, B:52:0x00f4, B:55:0x00fc, B:58:0x0105, B:62:0x010f, B:65:0x011a, B:66:0x011d, B:67:0x0122, B:68:0x0126, B:72:0x012e, B:75:0x0139, B:76:0x013c, B:79:0x0144), top: B:113:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0195 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0009, B:10:0x0012, B:13:0x0019, B:14:0x0022, B:19:0x002a, B:21:0x0032, B:80:0x0175, B:82:0x0180, B:85:0x018d, B:87:0x0195, B:88:0x019f, B:90:0x01af, B:92:0x01b3, B:94:0x01b7, B:96:0x01bb, B:98:0x01de, B:100:0x01e7, B:102:0x02a3, B:103:0x02a6, B:97:0x01dc, B:107:0x02ac, B:108:0x02b3, B:109:0x02b4, B:110:0x02ca, B:23:0x008c, B:25:0x0090, B:28:0x0095, B:29:0x00a5, B:32:0x00b7, B:35:0x00be, B:37:0x00c4, B:40:0x00cf, B:41:0x00d2, B:42:0x00d7, B:43:0x00db, B:46:0x00e0, B:48:0x00e6, B:51:0x00f1, B:52:0x00f4, B:55:0x00fc, B:58:0x0105, B:62:0x010f, B:65:0x011a, B:66:0x011d, B:67:0x0122, B:68:0x0126, B:72:0x012e, B:75:0x0139, B:76:0x013c, B:79:0x0144), top: B:113:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01dc A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0009, B:10:0x0012, B:13:0x0019, B:14:0x0022, B:19:0x002a, B:21:0x0032, B:80:0x0175, B:82:0x0180, B:85:0x018d, B:87:0x0195, B:88:0x019f, B:90:0x01af, B:92:0x01b3, B:94:0x01b7, B:96:0x01bb, B:98:0x01de, B:100:0x01e7, B:102:0x02a3, B:103:0x02a6, B:97:0x01dc, B:107:0x02ac, B:108:0x02b3, B:109:0x02b4, B:110:0x02ca, B:23:0x008c, B:25:0x0090, B:28:0x0095, B:29:0x00a5, B:32:0x00b7, B:35:0x00be, B:37:0x00c4, B:40:0x00cf, B:41:0x00d2, B:42:0x00d7, B:43:0x00db, B:46:0x00e0, B:48:0x00e6, B:51:0x00f1, B:52:0x00f4, B:55:0x00fc, B:58:0x0105, B:62:0x010f, B:65:0x011a, B:66:0x011d, B:67:0x0122, B:68:0x0126, B:72:0x012e, B:75:0x0139, B:76:0x013c, B:79:0x0144), top: B:113:0x0009 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:109:0x02b4, please report this as an issue */
    public synchronized PixmapPackerRectangle pack(String str, Pixmap pixmap) {
        int i;
        int i2;
        PixmapPackerRectangle pixmapPackerRectangle;
        Page pagePack;
        int i3;
        int i4;
        int i5;
        int i6;
        Texture texture;
        String str2 = str;
        Pixmap pixmap2 = pixmap;
        synchronized (this) {
            try {
                Pixmap pixmap3 = null;
                if (this.disposed) {
                    return null;
                }
                if (str2 != null && getRect(str) != null) {
                    throw new GdxRuntimeException("Pixmap has already been packed with name: ".concat(str2));
                }
                if (str2 == null || !str2.endsWith(".9")) {
                    if (this.stripWhitespaceX || this.stripWhitespaceY) {
                        int width = pixmap.getWidth();
                        int height = pixmap.getHeight();
                        int height2 = pixmap.getHeight();
                        if (this.stripWhitespaceY) {
                            int i7 = 0;
                            loop0: for (int i8 = 0; i8 < pixmap.getHeight(); i8++) {
                                for (int i9 = 0; i9 < pixmap.getWidth(); i9++) {
                                    if ((pixmap2.getPixel(i9, i8) & 255) > this.alphaThreshold) {
                                        break loop0;
                                    }
                                }
                                i7++;
                            }
                            int height3 = pixmap.getHeight();
                            loop2: while (true) {
                                height3--;
                                if (height3 < i7) {
                                    break;
                                }
                                for (int i10 = 0; i10 < pixmap.getWidth(); i10++) {
                                    if ((pixmap2.getPixel(i10, height3) & 255) > this.alphaThreshold) {
                                        break loop2;
                                    }
                                }
                                height2--;
                            }
                            i = i7;
                        } else {
                            i = 0;
                        }
                        int width2 = pixmap.getWidth();
                        if (this.stripWhitespaceX) {
                            int i11 = 0;
                            loop4: for (int i12 = 0; i12 < pixmap.getWidth(); i12++) {
                                for (int i13 = i; i13 < height2; i13++) {
                                    if ((pixmap2.getPixel(i12, i13) & 255) > this.alphaThreshold) {
                                        break loop4;
                                    }
                                }
                                i11++;
                            }
                            int width3 = pixmap.getWidth();
                            loop6: while (true) {
                                width3--;
                                if (width3 < i11) {
                                    break;
                                }
                                for (int i14 = i; i14 < height2; i14++) {
                                    if ((pixmap2.getPixel(width3, i14) & 255) > this.alphaThreshold) {
                                        break loop6;
                                    }
                                }
                                width2--;
                            }
                            i2 = i11;
                        } else {
                            i2 = 0;
                        }
                        int i15 = width2 - i2;
                        int i16 = height2 - i;
                        Pixmap pixmap4 = new Pixmap(i15, i16, pixmap.getFormat());
                        pixmap4.setBlending(Pixmap.Blending.None);
                        pixmap4.drawPixmap(pixmap, 0, 0, i2, i, i15, i16);
                        pixmapPackerRectangle = new PixmapPackerRectangle(0, 0, i15, i16, i2, i, width, height);
                        pixmap2 = pixmap4;
                    } else {
                        pixmapPackerRectangle = new PixmapPackerRectangle(0, 0, pixmap.getWidth(), pixmap.getHeight());
                    }
                    if (pixmapPackerRectangle.getWidth() <= this.pageWidth && pixmapPackerRectangle.getHeight() <= this.pageHeight) {
                        pagePack = this.packStrategy.pack(this, str2, pixmapPackerRectangle);
                        if (str2 != null) {
                            pagePack.rects.put(str2, pixmapPackerRectangle);
                            pagePack.addedRects.add(str2);
                        }
                        i3 = (int) pixmapPackerRectangle.x;
                        i4 = (int) pixmapPackerRectangle.y;
                        i5 = (int) pixmapPackerRectangle.width;
                        i6 = (int) pixmapPackerRectangle.height;
                        if (this.packToTexture || this.duplicateBorder || (texture = pagePack.texture) == null || pagePack.dirty) {
                            pagePack.dirty = true;
                        } else {
                            texture.bind();
                            Gdx.gl.glTexSubImage2D(pagePack.texture.glTarget, 0, i3, i4, i5, i6, pixmap2.getGLFormat(), pixmap2.getGLType(), pixmap2.getPixels());
                        }
                        pagePack.image.drawPixmap(pixmap2, i3, i4);
                        if (this.duplicateBorder) {
                            int width4 = pixmap2.getWidth();
                            int height4 = pixmap2.getHeight();
                            int i17 = i3 - 1;
                            int i18 = i4 - 1;
                            pagePack.image.drawPixmap(pixmap2, 0, 0, 1, 1, i17, i18, 1, 1);
                            int i19 = width4 - 1;
                            int i20 = i3 + i5;
                            pagePack.image.drawPixmap(pixmap2, i19, 0, 1, 1, i20, i18, 1, 1);
                            int i21 = height4 - 1;
                            int i22 = i4 + i6;
                            pagePack.image.drawPixmap(pixmap2, 0, i21, 1, 1, i17, i22, 1, 1);
                            pagePack.image.drawPixmap(pixmap2, i19, i21, 1, 1, i20, i22, 1, 1);
                            pagePack.image.drawPixmap(pixmap2, 0, 0, width4, 1, i3, i18, i5, 1);
                            pagePack.image.drawPixmap(pixmap2, 0, i21, width4, 1, i3, i22, i5, 1);
                            pagePack.image.drawPixmap(pixmap2, 0, 0, 1, height4, i17, i4, 1, i6);
                            pagePack.image.drawPixmap(pixmap2, i19, 0, 1, height4, i20, i4, 1, i6);
                        }
                        if (pixmap3 != null) {
                            pixmap3.dispose();
                        }
                        pixmapPackerRectangle.page = pagePack;
                        return pixmapPackerRectangle;
                    }
                    if (str2 == null) {
                        throw new GdxRuntimeException("Page size too small for pixmap.");
                    }
                    throw new GdxRuntimeException("Page size too small for pixmap: " + str2);
                }
                PixmapPackerRectangle pixmapPackerRectangle2 = new PixmapPackerRectangle(0, 0, pixmap.getWidth() - 2, pixmap.getHeight() - 2);
                Pixmap pixmap5 = new Pixmap(pixmap.getWidth() - 2, pixmap.getHeight() - 2, pixmap.getFormat());
                pixmap5.setBlending(Pixmap.Blending.None);
                int[] splits = getSplits(pixmap2);
                pixmapPackerRectangle2.splits = splits;
                pixmapPackerRectangle2.pads = getPads(pixmap2, splits);
                pixmap5.drawPixmap(pixmap, 0, 0, 1, 1, pixmap.getWidth() - 1, pixmap.getHeight() - 1);
                str2 = str2.split("\\.")[0];
                pixmapPackerRectangle = pixmapPackerRectangle2;
                pixmap2 = pixmap5;
                pixmap3 = pixmap2;
                if (pixmapPackerRectangle.getWidth() <= this.pageWidth) {
                    pagePack = this.packStrategy.pack(this, str2, pixmapPackerRectangle);
                    if (str2 != null) {
                        pagePack.rects.put(str2, pixmapPackerRectangle);
                        pagePack.addedRects.add(str2);
                    }
                    i3 = (int) pixmapPackerRectangle.x;
                    i4 = (int) pixmapPackerRectangle.y;
                    i5 = (int) pixmapPackerRectangle.width;
                    i6 = (int) pixmapPackerRectangle.height;
                    if (this.packToTexture) {
                        pagePack.dirty = true;
                    } else {
                        pagePack.dirty = true;
                    }
                    pagePack.image.drawPixmap(pixmap2, i3, i4);
                    if (this.duplicateBorder) {
                        int width5 = pixmap2.getWidth();
                        int height5 = pixmap2.getHeight();
                        int i110 = i3 - 1;
                        int i111 = i4 - 1;
                        pagePack.image.drawPixmap(pixmap2, 0, 0, 1, 1, i110, i111, 1, 1);
                        int i112 = width5 - 1;
                        int i23 = i3 + i5;
                        pagePack.image.drawPixmap(pixmap2, i112, 0, 1, 1, i23, i111, 1, 1);
                        int i24 = height5 - 1;
                        int i25 = i4 + i6;
                        pagePack.image.drawPixmap(pixmap2, 0, i24, 1, 1, i110, i25, 1, 1);
                        pagePack.image.drawPixmap(pixmap2, i112, i24, 1, 1, i23, i25, 1, 1);
                        pagePack.image.drawPixmap(pixmap2, 0, 0, width5, 1, i3, i111, i5, 1);
                        pagePack.image.drawPixmap(pixmap2, 0, i24, width5, 1, i3, i25, i5, 1);
                        pagePack.image.drawPixmap(pixmap2, 0, 0, 1, height5, i110, i4, 1, i6);
                        pagePack.image.drawPixmap(pixmap2, i112, 0, 1, height5, i23, i4, 1, i6);
                    }
                    if (pixmap3 != null) {
                        pixmap3.dispose();
                    }
                    pixmapPackerRectangle.page = pagePack;
                    return pixmapPackerRectangle;
                }
                if (str2 == null) {
                    throw new GdxRuntimeException("Page size too small for pixmap.");
                }
                throw new GdxRuntimeException("Page size too small for pixmap: " + str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public PixmapPacker(int i, int i2, Pixmap.Format format, int i3, boolean z, boolean z2, boolean z3, PackStrategy packStrategy) {
        this.transparentColor = new Color(0.0f, 0.0f, 0.0f, 0.0f);
        this.pages = new Array<>();
        this.c = new Color();
        this.pageWidth = i;
        this.pageHeight = i2;
        this.pageFormat = format;
        this.padding = i3;
        this.duplicateBorder = z;
        this.stripWhitespaceX = z2;
        this.stripWhitespaceY = z3;
        this.packStrategy = packStrategy;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0083  */
    public synchronized void updateTextureAtlas(TextureAtlas textureAtlas, Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, boolean z, boolean z2) {
        int i;
        try {
            updatePageTextures(textureFilter, textureFilter2, z);
            Array.ArrayIterator<Page> it = this.pages.iterator();
            while (it.hasNext()) {
                Page next = it.next();
                Array<String> array = next.addedRects;
                if (array.size > 0) {
                    Array.ArrayIterator<String> it2 = array.iterator();
                    while (it2.hasNext()) {
                        String next2 = it2.next();
                        PixmapPackerRectangle pixmapPackerRectangle = next.rects.get(next2);
                        TextureAtlas.AtlasRegion atlasRegion = new TextureAtlas.AtlasRegion(next.texture, (int) pixmapPackerRectangle.x, (int) pixmapPackerRectangle.y, (int) pixmapPackerRectangle.width, (int) pixmapPackerRectangle.height);
                        int[] iArr = pixmapPackerRectangle.splits;
                        if (iArr != null) {
                            atlasRegion.names = new String[]{"split", "pad"};
                            atlasRegion.values = new int[][]{iArr, pixmapPackerRectangle.pads};
                        }
                        if (z2) {
                            Matcher matcher = indexPattern.matcher(next2);
                            if (matcher.matches()) {
                                next2 = matcher.group(1);
                                i = Integer.parseInt(matcher.group(2));
                            } else {
                                i = -1;
                            }
                        } else {
                            i = -1;
                        }
                        atlasRegion.name = next2;
                        atlasRegion.index = i;
                        atlasRegion.offsetX = pixmapPackerRectangle.offsetX;
                        int i2 = pixmapPackerRectangle.originalHeight;
                        atlasRegion.offsetY = (int) ((i2 - pixmapPackerRectangle.height) - pixmapPackerRectangle.offsetY);
                        atlasRegion.originalWidth = pixmapPackerRectangle.originalWidth;
                        atlasRegion.originalHeight = i2;
                        textureAtlas.getRegions().add(atlasRegion);
                    }
                    next.addedRects.clear();
                    textureAtlas.getTextures().add(next.texture);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static class PixmapPackerRectangle extends Rectangle {
        public int offsetX;
        public int offsetY;
        public int originalHeight;
        public int originalWidth;
        public int[] pads;
        public Page page;
        public int[] splits;

        public PixmapPackerRectangle(int i, int i2, int i3, int i4) {
            super(i, i2, i3, i4);
            this.offsetX = 0;
            this.offsetY = 0;
            this.originalWidth = i3;
            this.originalHeight = i4;
        }

        public PixmapPackerRectangle(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            super(i, i2, i3, i4);
            this.offsetX = i5;
            this.offsetY = i6;
            this.originalWidth = i7;
            this.originalHeight = i8;
        }
    }
}
