 ----------------------------------------------------------------
-- MAIN
----------------------------------------------------------------


--==============================================================
-- Table: DEV.TEAM
--==============================================================
create table TEAM (
    ID                              integer         not null,
    NAME                            varchar(100)     null,
    UKUPNO                          integer         not null,        
    POBJEDA                         integer         not null,        
    NERIJESENO                      integer         not null,        
    PORAZ                           integer         not null,        
    POSTIGNUTI_BROJEVI              integer         not null,        
    PRIMLJENI_GOLOVI                integer         not null,        
    GOL_RAZLIKA                     integer         not null,        
    BODOVI                          integer         not null,        
    
    primary key (ID)
);


--==============================================================
-- Table: DEV.PLAYER
--==============================================================
create table PLAYER (
    ID                              integer         not null,
    TEAM_ID                         integer         not null,
    NAME                            varchar(100)     null,
    NUMBER                          varchar(100)     null,
    POSITION                         varchar(100)      null,
    
    
    primary key (ID)
);




CREATE SEQUENCE DEV.PLAYER
  start with 100
  cache 50;

CREATE SEQUENCE DEV.TEAM
  start with 100
  cache 50;


