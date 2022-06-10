# hanghaeHomework
항해99 PBL 1주차 과제

  nid = BoardId,
  mid = CommentId

  |**분류**|**기능**|**Method**|**URL**|**Return**|**비고**|
  |:---:|:---:|:---:|:---:|:---:|:---:|
  |게시글|전체 게시글 목록 조회|GET|/api/board|List\<Board\>|작성 날짜 기준 내림차순|
  | |게시글 작성|POST|/api/board|Board|
  | |게시글 조회|GET|/api/board/:boardId|Board|
  | |게시글 수정|PUT|/api/board/:boardId|Long|
  | |게시글 삭제|DELETE|/api/board/:boardId|Long|
  |좋아요|게시글 좋아요|GET|/api/board/:boardId/like|||
  | |게시글 좋아요 취소|GET|/api/board/:boardId/like|||
  |회원관리|회원가입|POST|/api/register|||
  | |로그인|GET|api/login|||
  |댓글|댓글 목록 조회|GET|/api/comments?board_id={nid} |List\<Comments\>|작성 날짜 기준 내림차순|
  | |댓글 작성|POST|/api/comments?board_id={nid} |Comments|
  | |댓글 수정|PUT|/api/comments/{mid}|Long|
  | |댓글 삭제|DELETE|/api/comments/{mid}|Long|
