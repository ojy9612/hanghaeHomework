# hanghaeHomework
항해99 1주차 PBL 과제

  nid = BoardId,
  mid = CommentId

  |**분류**|**기능**|**Method**|**URL**|**Return**|**비고**|
  |:---:|:---:|:---:|:---:|:---:|:---:|
  |게시글|전체 게시글 목록 조회|GET|/api/boards/all|List\<Board\>|작성 날짜 기준 내림차순|
  | |게시글 작성|POST|/api/boards|Board|
  | |게시글 조회|GET|/api/boards/{nid}|Board|
  | |게시글 수정|PUT|/api/boards/{nid}|Long|
  | |게시글 삭제|DELETE|/api/boards/{nid}|Long|
  |댓글|댓글 목록 조회|GET|/api/comments?board_id={nid} |List\<Comments\>|작성 날짜 기준 내림차순|
  | |댓글 작성|POST|/api/comments?board_id={nid} |Comments|
  | |댓글 수정|PUT|/api/comments/{mid}|Long|
  | |댓글 삭제|DELETE|/api/comments/{mid}|Long|
