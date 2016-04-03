package com.he.base;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by HE on 2016/4/3.
 */
@Setter
@Getter
public class Grid<T> {
    long total;
    List<T> rows;
}
