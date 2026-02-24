create table if not exists cos_project
(
    id         bigserial                           not null primary key,
    version    integer                             null,
    display_id varchar(64)                         not null,
    org_id     bigint                              not null,
    name       varchar(64)                         not null,
    slug       varchar(32)                         null,
    logo_url   varchar(512)                        null,
    status     varchar(32)                         not null,
    created_by varchar(64)                         not null,
    updated_by varchar(64)                         not null,
    deleted_by varchar(64)                         null,
    created_at timestamp DEFAULT CURRENT_TIMESTAMP not null,
    updated_at timestamp DEFAULT CURRENT_TIMESTAMP not null,
    deleted_at timestamp                           null
);

create index if not exists idx_project_org_id on cos_project(org_id);
create unique index if not exists uq_project_display_id on cos_project(display_id);
create unique index if not exists uq_project_name on cos_project(name);
