package com.myblog8.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostResponse {
    List<PostDto> dto;
    private int pageSize;
    private int pageNo;
    private boolean lastPage;
    private int  totalPages;

}
