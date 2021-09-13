package com.scwang.smartrefresh.header.waterdrop;

import com.scwang.smartrefresh.layout.internal.pathview.PathsDrawable;

/**
 * 旋转动画
 * Created by SCWANG on 2017/6/16.
 */

public class ProgressDrawable extends PathsDrawable {

    public ProgressDrawable() {

        parserPaths(
            "m35,23a2,2 0,0 1,-2 2,2 2,0 0,1 -2,-2 2,2 0,0 1,2 -2,2 2,0 0,1 2,2zM31,17h4v6h-4zM35,17a2,2 0,0 1,-2 2,2 2,0 0,1 -2,-2 2,2 0,0 1,2 -2,2 2,0 0,1 2,2z",
            "m39.73,25.34a2,2 53.35,0 1,-2.73 0.73,2 2,53.35 0,1 -0.73,-2.73 2,2 53.35,0 1,2.73 -0.73,2 2,53.35 0,1 0.73,2.73zM39.27,18.14l3.46,2l-3,5.2l-3.46,-2zM42.73,20.14a2,2 75.01,0 1,-2.73 0.73,2 2,75.01 0,1 -0.73,-2.73 2,2 75.01,0 1,2.73 -0.73,2 2,75.01 0,1 0.73,2.73z",
            "m42.66,29.73a2,2 113.68,0 1,-2.73 -0.73,2 2,113.68 0,1 0.73,-2.73 2,2 113.68,0 1,2.73 0.73,2 2,113.68 0,1 -0.73,2.73zM45.86,23.27l2,3.46l-5.2,3l-2,-3.46zM47.86,26.73a2,2 113.68,0 1,-2.73 -0.73,2 2,113.68 0,1 0.73,-2.73 2,2 113.68,0 1,2.73 0.73,2 2,113.68 0,1 -0.73,2.73z",
            "m43,35a2,2 0,0 1,-2 -2,2 2,0 0,1 2,-2 2,2 0,0 1,2 2,2 2,0 0,1 -2,2zM49,31l0,4l-6,0l0,-4zM49,35a2,2 0,0 1,-2 -2,2 2,0 0,1 2,-2 2,2 0,0 1,2 2,2 2,0 0,1 -2,2z",
            "m40.66,39.73a2,2 74.6,0 1,-0.73 -2.73,2 2,74.6 0,1 2.73,-0.73 2,2 74.6,0 1,0.73 2.73,2 2,74.6 0,1 -2.73,0.73zM47.86,39.27l-2,3.46l-5.2,-3l2,-3.46zM45.86,42.73a2,2 74.6,0 1,-0.73 -2.73,2 2,74.6 0,1 2.73,-0.73 2,2 74.6,0 1,0.73 2.73,2 2,74.6 0,1 -2.73,0.73z",
            "m36.27,42.66a2,2 104.99,0 1,0.73 -2.73,2 2,104.99 0,1 2.73,0.73 2,2 104.99,0 1,-0.73 2.73,2 2,104.99 0,1 -2.73,-0.73zM42.73,45.86l-3.46,2l-3,-5.2l3.46,-2zM39.27,47.86a2,2 104.99,0 1,0.73 -2.73,2 2,104.99 0,1 2.73,0.73 2,2 104.99,0 1,-0.73 2.73,2 2,104.99 0,1 -2.73,-0.73z",
            "m35,49a2,2 0,0 1,-2 2,2 2,0 0,1 -2,-2 2,2 0,0 1,2 -2,2 2,0 0,1 2,2zM31,43h4v6h-4zM35,43a2,2 0,0 1,-2 2,2 2,0 0,1 -2,-2 2,2 0,0 1,2 -2,2 2,0 0,1 2,2z",
            "m26.73,47.86a2,2 83.41,0 1,-2.73 0.73,2 2,83.41 0,1 -0.73,-2.73 2,2 83.41,0 1,2.73 -0.73,2 2,83.41 0,1 0.73,2.73zM26.27,40.66l3.46,2l-3,5.2l-3.46,-2zM29.73,42.66a2,2 70.19,0 1,-2.73 0.73,2 2,70.19 0,1 -0.73,-2.73 2,2 70.19,0 1,2.73 -0.73,2 2,70.19 0,1 0.73,2.73z",
            "m20.14,42.73a2,2 94.83,0 1,-2.73 -0.73,2 2,94.83 0,1 0.73,-2.73 2,2 94.83,0 1,2.73 0.73,2 2,94.83 0,1 -0.73,2.73zM23.34,36.27l2,3.46l-5.2,3l-2,-3.46zM25.34,39.73a2,2 104.78,0 1,-2.73 -0.73,2 2,104.78 0,1 0.73,-2.73 2,2 104.78,0 1,2.73 0.73,2 2,104.78 0,1 -0.73,2.73z",
            "m17,35a2,2 0,0 1,-2 -2,2 2,0 0,1 2,-2 2,2 0,0 1,2 2,2 2,0 0,1 -2,2zM23,31l0,4l-6,0l0,-4zM23,35a2,2 0,0 1,-2 -2,2 2,0 0,1 2,-2 2,2 0,0 1,2 2,2 2,0 0,1 -2,2z",
            "m18.14,26.73a2,2 74.91,0 1,-0.73 -2.73,2 2,74.91 0,1 2.73,-0.73 2,2 74.91,0 1,0.73 2.73,2 2,74.91 0,1 -2.73,0.73zM25.34,26.27l-2,3.46l-5.2,-3l2,-3.46zM23.34,29.73a2,2 83.13,0 1,-0.73 -2.73,2 2,83.13 0,1 2.73,-0.73 2,2 83.13,0 1,0.73 2.73,2 2,83.13 0,1 -2.73,0.73z",
            "m23.27,20.14a2,2 104.39,0 1,0.73 -2.73,2 2,104.39 0,1 2.73,0.73 2,2 104.39,0 1,-0.73 2.73,2 2,104.39 0,1 -2.73,-0.73zM29.73,23.34l-3.46,2l-3,-5.2l3.46,-2zM26.27,25.34a2,2 113.78,0 1,0.73 -2.73,2 2,113.78 0,1 2.73,0.73 2,2 113.78,0 1,-0.73 2.73,2 2,113.78 0,1 -2.73,-0.73z"
        );

        parserColors(
                0x11aaaaaa,
                0x22aaaaaa,
                0x33aaaaaa,
                0x44aaaaaa,
                0x55aaaaaa,
                0x66aaaaaa,
                0x77aaaaaa,
                0x88aaaaaa,
                0x99aaaaaa,
                0xaaaaaaaa,
                0xbbaaaaaa,
                0xccaaaaaa
                );
    }
}
